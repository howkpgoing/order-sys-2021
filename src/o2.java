import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class o2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					o2 frame = new o2();
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
	public o2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("薯餅");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(116, 35, 358, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("滿福堡");
		btnNewButton_1_1.setBounds(116, 83, 358, 38);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("薯條(大)");
		btnNewButton_1_2.setBounds(116, 131, 358, 38);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("大麥克");
		btnNewButton_1_3.setBounds(116, 179, 358, 38);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton = new JButton("Go to Checkout!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(185, 287, 195, 32);
		contentPane.add(btnNewButton);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(550, 10, 17, 269);
		contentPane.add(scrollBar);
		
		JButton btnNewButton_2 = new JButton("玉米濃湯");
		btnNewButton_2.setBounds(116, 227, 358, 38);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("\u55AE\u9EDE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("DialogInput", Font.PLAIN, 14));
		lblNewLabel.setBounds(230, 10, 118, 15);
		contentPane.add(lblNewLabel);
	}

}
