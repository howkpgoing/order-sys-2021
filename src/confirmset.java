import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import setmeal.index;
import setmeal.setlist;

public class confirmset extends JFrame {

	private JPanel contentPane;
	JLabel q;
	int price;
	String name;
	int quantity=0;
	String path;
	String meals="";
	
	
	public confirmset(setlist menu, index listindex) {
		price = menu.list.get(listindex).getp();
		name = menu.list.get(listindex).getn();
		path = menu.list.get(listindex).getpath();
		
		for(int i = 0 ;i < 3 ;i++)
		{
			int j =menu.list.get(listindex).getf().get(i); 
			j-=1;
			if(j>=0)
			{
				meals+=menu.totalmeal.get(j).getn();
				meals+=",";
			}
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton back = new JButton("\u8FD4\u56DE");
		back.setFont(new Font("DialogInput", Font.PLAIN, 16));
		back.setBounds(10, 10, 85, 23);
		contentPane.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				o1 order = new o1(menu);
				order.setVisible(true);
				dispose();
			}
		});

		JButton confirm = new JButton("\u78BA\u8A8D\u9910\u9EDE");
		confirm.setFont(new Font("DialogInput", Font.PLAIN, 16));
		confirm.setBounds(252, 222, 191, 31);
		contentPane.add(confirm);
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.add(listindex,quantity);
				o1 order = new o1(menu);
				order.setVisible(true);
				dispose();
			}
		});

		JLabel namelabel = new JLabel("\u50F9\u683C: "+name);
		namelabel.setFont(new Font("DialogInput", Font.PLAIN, 20));
		namelabel.setBounds(247, 87, 170, 23);
		contentPane.add(namelabel);

		JLabel pricelabel = new JLabel("\u9910\u9EDE: "+price);
		pricelabel.setFont(new Font("DialogInput", Font.PLAIN, 20));
		pricelabel.setBounds(250, 43, 155, 24);
		contentPane.add(pricelabel);

		JButton less = new JButton("-");
		less.setFont(new Font("DialogInput", Font.PLAIN, 20));
		less.setBounds(252, 176, 46, 23);
		contentPane.add(less);
		less.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(quantity>0)quantity--;
				q.setText(String.valueOf(quantity));
			}
		});

		JButton add = new JButton("+");
		add.setFont(new Font("DialogInput", Font.PLAIN, 20));
		add.setBounds(397, 176, 46, 23);
		contentPane.add(add);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity++;
				q.setText(String.valueOf(quantity));
			}
		});
		
		q = new JLabel(Integer.toString(quantity));
		q.setHorizontalAlignment(SwingConstants.CENTER);
		q.setForeground(Color.BLACK);
		q.setFont(new Font("DialogInput", Font.PLAIN, 16));
		q.setBounds(319, 176, 59, 20);
		contentPane.add(q);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(path));
		lblNewLabel_1.setBounds(10, 43, 226, 199);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblName_1 = new JLabel("\u9644:"+meals);
		lblName_1.setFont(new Font("DialogInput", Font.PLAIN, 11));
		lblName_1.setBounds(252, 128, 199, 24);
		contentPane.add(lblName_1);
	}
}
