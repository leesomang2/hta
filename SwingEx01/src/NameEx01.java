import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class NameEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NameEx01 frame = new NameEx01();
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
	public NameEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uC0AC\uC6D0\uC774\uB984 \uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 23, 572, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(6, 17, 439, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("사원이름 검색");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String strEname = textField.getText();
				if (strEname.length() < 2) {
					textArea.setText("사원 이름을 2자 이상 입력");

				} else {
					textArea.setText("");

					// 데이터베이스 연결
					NameDAO dao = new NameDAO();
					ArrayList<NameTO> addresses = dao.searchName(strEname); //우편번호검색해서 나오게하기
					
					for (NameTO to : addresses ) {
						// 후처리
						String empno = to.getEmpno();
						String ename = to.getEname();
						String job = to.getJob();
						String dname = to.getDname();
						String loc = to.getLoc();
						

						String address = String.format("[%s] %s %s %s %s ", empno, ename, job, dname, loc);
						textArea.append(address + System.lineSeparator());
					}

				}
			}
		});
		btn.setBounds(449, 17, 117, 27);
		panel.add(btn);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 78, 560, 526);
		contentPane.add(textArea);
	}

}
