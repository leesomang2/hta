import javax.swing.JFrame;

public class JFrameEx03 extends JFrame {

	public static void main(String[] args) {
		
		//상속
		
		JFrameEx03 frame = new JFrameEx03();

		frame.setVisible(true);
	}
	
	public JFrameEx03() {
		// TODO Auto-generated constructor stub
		//생성자
		// 크기와 위치
		//setSize(1024, 768);
		//setLocation(100, 100);
		
		//위치 크기 한번에
		setBounds(100, 100, 1024, 768);
		
		setTitle("프레임 타이틀"); //제목글 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기버튼 *
	}
}
