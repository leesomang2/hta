import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;

public class JFrameEx06 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx06 frame = new JFrameEx06();
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
	public JFrameEx06() {
		setResizable(false);
		setTitle("난 타이틀");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btn1 = new JButton("");
		btn1.setBounds(12, 10, 251, 135);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		btn1.setIcon(new ImageIcon("C:\\java\\java-workspace\\SwingEx01\\button.jpg"));
		btn1.setVerticalAlignment(SwingConstants.TOP);
		btn1.setHorizontalAlignment(SwingConstants.RIGHT);
		btn1.setForeground(Color.BLUE);
		btn1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 16));
		
		contentPane.add(btn1);
	}
}
