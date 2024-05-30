import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Font;

public class GugudanEx01 extends JFrame {

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
					GugudanEx01 frame = new GugudanEx01();
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
	public GugudanEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uAD6C\uAD6C\uB2E8 \uC785\uB825", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(12, 10, 553, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl1 = new JLabel("단수 입력 : ");
		lbl1.setBounds(6, 21, 64, 15);
		panel.add(lbl1);
		
		textField = new JTextField();
		textField.setBounds(76, 18, 356, 21);
		panel.add(textField);
		textField.setText("단수를 입력하세요.");
		textField.setColumns(10);
		
		JButton btn = new JButton("구구단 출력");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText(""); // 초기화 목적
				
				String s = (textField.getText());
				int num =  Integer.parseInt(s);
				
				for( int i = 1; i <= 9; i++) {
					
					textArea.append(num + "X" + i + " = " + num * i +"\n" );
				}
			}
		});
		btn.setBounds(432, 17, 109, 23);
		panel.add(btn);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("휴먼모음T", Font.BOLD | Font.ITALIC, 15));
		textArea.setBackground(new Color(255, 255, 128));
		textArea.setEditable(false);
		textArea.setBounds(22, 66, 543, 554);
		contentPane.add(textArea);
	}

}
