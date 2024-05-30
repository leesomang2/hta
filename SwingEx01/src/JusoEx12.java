import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JusoEx12 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JusoEx12 frame = new JusoEx12();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public JusoEx12() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 800);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "우편번호 검색기", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel.setBounds(16, 23, 548, 69);
        contentPane.add(panel);
        panel.setLayout(null);

        JButton btn = new JButton("우편번호 검색");
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                searchZipcode();
            }
        });

        btn.setBounds(425, 17, 116, 26);
        panel.add(btn);

        textField = new JTextField();
        textField.setBounds(6, 20, 417, 21);
        panel.add(textField);
        textField.setText("우편번호를 입력하세요.");
        textField.setColumns(10);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(16, 112, 548, 500);
        contentPane.add(scrollPane);

        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
    }

    /**
     * Search zipcode and display results in textArea.
     */
    private void searchZipcode() {
        String input = textField.getText().trim();
        if (input.isEmpty()) {
            textArea.setText("우편번호를 입력하세요.");
            return;
        }

        String url = "jdbc:mariadb://localhost:3306/project";
        String user = "project";
        String password = "123456";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        StringBuilder results = new StringBuilder();

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            String sql = String.format("SELECT zipcode, sido, gugun, dong, ri, bunji FROM zipcode WHERE dong LIKE '%s%%'", input);
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String zipcode = rs.getString("zipcode");
                String sido = rs.getString("sido");
                String gugun = rs.getString("gugun");
                String dong = rs.getString("dong");
                String ri = rs.getString("ri");
                String bunji = rs.getString("bunji");

                String result = String.format("[%s] %s %s %s %s %s",
                        zipcode, sido, gugun, dong, ri, bunji);
                results.append(result).append("\n");
            }

            if (results.length() == 0) {
                textArea.setText("검색 결과가 없습니다.");
            } else {
                textArea.setText(results.toString());
            }

        } catch (ClassNotFoundException e) {
            textArea.setText("[에러] 드라이버를 찾을 수 없습니다: " + e.getMessage());
        } catch (SQLException e) {
            textArea.setText("[에러] SQL 오류: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {}
            if (stmt != null) try { stmt.close(); } catch (SQLException e) {}
            if (conn != null) try { conn.close(); } catch (SQLException e) {}
        }
    }
}
