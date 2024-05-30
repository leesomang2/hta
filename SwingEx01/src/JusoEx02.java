import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JusoEx02 extends JFrame {

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
					JusoEx02 frame = new JusoEx02();
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
	public JusoEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"\uC6B0\uD3B8\uBC88\uD638 \uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 0, 0)));
		panel.setBounds(16, 23, 548, 69);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btn = new JButton("우편번호 검색");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String strDong = textField.getText();
				if (strDong.length() < 2) {
					textArea.setText("동이름을 2자 이상 입력");

				} else {
					textArea.setText("");

					// 데이터베이스 연결
					ZipcodeDAO dao = new ZipcodeDAO();
					ArrayList<ZipcodeTO> addresses = dao.searchZipcode(strDong); //우편번호검색해서 나오게하기
					
					for (ZipcodeTO to : addresses ) {
						// 후처리
						String zipcode = to.getZipcode();
						String sido = to.getSido();
						String gugun = to.getGugun();
						String dong = to.getDong();
						String ri = to.getRi();
						String bunji = to.getBunji();

						String address = String.format("[%s] %s %s %s %s %s", zipcode, sido, gugun, dong, ri, bunji);
						textArea.append(address + System.lineSeparator());
					}

				}
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

}
