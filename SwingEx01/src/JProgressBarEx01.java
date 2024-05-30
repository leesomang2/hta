

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JProgressBarEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JProgressBarEx01 frame = new JProgressBarEx01();
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
	public JProgressBarEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setValue(100);
		progressBar.setMaximum(200);
		progressBar.setBounds(12, 10, 560, 36);
		contentPane.add(progressBar);
		
		JButton btn1 = new JButton("감소");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(progressBar.getValue());
				int min = progressBar.getMinimum(); //최소값 뽑기
				progressBar.setValue(progressBar.getValue() - 10 );
				if( progressBar.getMinimum() == progressBar.getValue() ) {
					
					System.out.println(" 최소값입니다 " +"최소값은 :" + min);
				}
			}
		});
		btn1.setBounds(12, 56, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("증가");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int max = progressBar.getMaximum(); //최대값 뽑기
				progressBar.setValue(progressBar.getValue() + 10 );
				if( progressBar.getMaximum() == progressBar.getValue()) {
					
					System.out.println(" 최대값입니다 " + "최대값은 : " + max );
				}
			}
		});
		btn2.setBounds(475, 56, 97, 23);
		contentPane.add(btn2);
	}
}
