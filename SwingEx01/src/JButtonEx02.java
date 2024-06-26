import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class JButtonEx02 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JButtonEx02 frame = new JButtonEx02();
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
	public JButtonEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("기본 내용");
		btn1.setBounds(12, 10, 560, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("활성화");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("활성화");
				
				//btn1.setEnabled(true);//버튼1 활성화
				btn1.setVisible(true); //버튼생김
			}
		});
		btn2.setBounds(12, 43, 260, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("비활성화");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("비활성화");
				
				//btn1.setEnabled(false); //버튼1 비활성화
				btn1.setVisible(false); //아예지우기
			}
		});
		btn3.setBounds(285, 43, 287, 23);
		contentPane.add(btn3);
		
		JLabel lbl1 = new JLabel("New label");
		lbl1.setBounds(12, 76, 560, 66);
		contentPane.add(lbl1);
		
		JButton btn4 = new JButton("New button");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String msg = lbl1.getText();
				System.out.println( msg ); //버튼클릭으로 라벨접근
				
				lbl1.setText("New Message"); //라벨명 변경
			}
		});
		btn4.setBounds(12, 152, 560, 23);
		contentPane.add(btn4);
	}

}
