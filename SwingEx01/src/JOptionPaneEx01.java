import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JOptionPaneEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaneEx01 frame = new JOptionPaneEx01();
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
	public JOptionPaneEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("메시지");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//JOptionPane.showMessageDialog(JOptionPaneEx01.this, "메시지"); //부속적인 창 출력
			//	JOptionPane.showMessageDialog(JOptionPaneEx01.this, "메시지","타이틀",JOptionPane.WARNING_MESSAGE); //타이틀까지출력
				JOptionPane.showMessageDialog(JOptionPaneEx01.this, "메시지","타이틀",JOptionPane.ERROR_MESSAGE); //에러메시지로 출력
			}
		});
		btn1.setBounds(12, 10, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("확인");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//JOptionPane.showConfirmDialog(JOptionPaneEx01.this, "메시지"); // 예 아니오 취소 3가지 확인창출력
				int result = JOptionPane.showConfirmDialog(JOptionPaneEx01.this, "메시지","타이틀",JOptionPane.OK_CANCEL_OPTION); // 예 아니오 두개출력
				//JOptionPane.showConfirmDialog(JOptionPaneEx01.this, "메시지","타이틀",JOptionPane.YES_NO_CANCEL_OPTION); // 예Y 아니오N 
				
				if(result == JOptionPane.OK_OPTION) {
					System.out.println("OK");
				}else if(result == JOptionPane.CANCEL_OPTION) {
					System.out.println("CANCEL");
				}else {
					System.out.println("기타");
				}
			}
		});
		btn2.setBounds(12, 40, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("입력");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//JOptionPane.showInputDialog("메시지"); // 입력받는창 출력
				String result = JOptionPane.showInputDialog("메시지","내용");// 입력받는창에 초기값 설정
				
				if(result != null) {
					System.out.println(result);
				}else {
					System.out.println("취소");
				}
				
			}
		});
		btn3.setBounds(12, 73, 97, 23);
		contentPane.add(btn3);
	}
}
