import javax.swing.JFrame;

public class JFrameEx02 extends JFrame {

	public static void main(String[] args) {
		
		//상속
		
		JFrameEx02 frame = new JFrameEx02();

		
		// 크기와 위치
		frame.setSize(1024, 768);
		frame.setLocation(100, 100);

		frame.setVisible(true);
	}
}
