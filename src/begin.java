import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import setmeal.setlist;

public class begin extends JFrame {

	private JPanel contentPane;
	JFrame f = new JFrame();
	public begin(setlist menu) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u958B\u59CB\u9EDE\u9910");
		btnNewButton.setBounds(406, 166, 118, 62);
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				o1 a = new o1(menu);
				 a.setVisible(true);
				 dispose();
			}
		});
		
		JLabel lblNewLabel = new JLabel("\u6B61\u8FCE\u4F86\u5230");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(315, 32, 149, 92);
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\u9000\u51FA");
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		btnNewButton_1.setBounds(251, 166, 118, 62);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("\u4F60\u6E96\u5099\u597D\u8981\u5927\u5FEB\u6735\u9824\u4E86\u55CE");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(-19, 0, 324, 60);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Pic\\start.PNG"));
		lblNewLabel_2.setBounds(22, 42, 218, 228);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Java B\u73ED\u7B2C11\u7D44\u9910\u5EF3\u7684\u9EDE\u9910\u7CFB\u7D71 !!");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_3.setBounds(250, 86, 284, 52);
		contentPane.add(lblNewLabel_3);
		
		f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e) {
		    System.exit(0);
		}
		});
	}

}
