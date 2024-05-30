import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField1;
	private JLabel lbl1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex01 frame = new Ex01();
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
	public Ex01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setText("hong gil dong");
		textField1.setBounds(12, 10, 560, 34);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JButton btn1 = new JButton("대문자로 변경");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String s =  textField1.getText();
				String[] names = s.split(" ");
				
				for( int i = 0 ; i < names.length; i++) {
					names[i] = names[i].substring(0,1).toUpperCase()+names[i].substring(1).toLowerCase();
				}
				lbl1.setText("출력 : " +String.join(" ", names));
			}
		});
		btn1.setBounds(12, 54, 560, 53);
		contentPane.add(btn1);
		
		lbl1 = new JLabel("New label");
		lbl1.setBounds(12, 112, 560, 34);
		contentPane.add(lbl1);
	}

}
