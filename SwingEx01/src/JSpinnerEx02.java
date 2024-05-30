import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JSpinnerEx02 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JSpinner spinner1;
	private JSpinner spinner2;
	private JButton btn1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSpinnerEx02 frame = new JSpinnerEx02();
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
	public JSpinnerEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		spinner1 = new JSpinner();
		//실제데이터 외부로 빼기
		String[] items = new String[] {"\uC0AC\uACFC", "\uC218\uBC15", "\uB538\uAE30", "\uCC38\uC678"};
		
		SpinnerListModel spinnerListModel = new SpinnerListModel(items);
		spinner1.setModel(spinnerListModel );
		spinner1.setBounds(10, 10, 562, 22);
		contentPane.add(spinner1);
		
		spinner2 = new JSpinner();
		spinner2.setModel(new CustomSpinnerListModel() );
		spinner2.setBounds(10, 42, 563, 22);
		contentPane.add(spinner2);
		
		JSpinner spinner3 = new JSpinner();
		spinner3.setBounds(10, 74, 562, 22);
		contentPane.add(spinner3);
		
		btn1 = new JButton("데이터 넣기");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				spinner3.setModel(new CustomSpinnerListModel());
			}
		});
		btn1.setBounds(10, 106, 156, 23);
		contentPane.add(btn1);
	}

}
