import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class JLabelEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabelEx01 frame = new JLabelEx01();
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
	public JLabelEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Hello World");
		lbl1.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 16));
		lbl1.setForeground(new Color(128, 128, 192));
		lbl1.setBounds(12, 10, 560, 52);
		
		
		lbl1.setText("Hello World2"); // 내용수정 
		
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("<html><body><font color = 'red'>Hello World1</font><br />Hello World2</body></html>");
		lbl2.setBounds(12, 72, 572, 64);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("New label");
		//lbl3.setIcon(new ImageIcon(JLabelEx01.class.getResource("/images/button.jpg")));
		lbl3.setIcon(new ImageIcon(JLabelEx01.class.getResource("/images/button.jpg"))); //절대경로
		lbl3.setBounds(12, 146, 250, 127);
		contentPane.add(lbl3);
	}
}
