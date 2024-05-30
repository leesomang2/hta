import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameEx04 extends JFrame {
	private JPanel contentPane;
	
	public static void main(String[] args) {
		//프로그램시작
		
		JFrameEx04 frame = new JFrameEx04()	;
		frame.setVisible(true);
	}
	
	public JFrameEx04() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기		
		
		setBounds(100, 100, 1024, 768); //위치 크기 
		
		//컴포넌트 들어갈 공간
		contentPane = new JPanel();
		contentPane.setBackground(Color.green);
		
		//null - Absolute Layout
		contentPane.setLayout(null);
		
		//입력
		JButton btn1 = new JButton("난 버튼");
		btn1.setBounds(10, 10, 100, 25);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("난 버튼2");
		btn2.setBounds(10, 40, 100, 25);
		contentPane.add(btn2);
		
		setContentPane( contentPane );
	}
}
