import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import setmeal.setlist;
import setmeal.index;
import javax.swing.SwingConstants;

public class confirmscreen extends JFrame {

	private JPanel contentPane;
	JLabel q ;
	int price;
	String name;
	int quantity=0;
	String path;
	String type;
	String breakfast;
	/**
	 * Create the frame.
	 */
	public confirmscreen(setlist menu, index listindex) {
			
		price = menu.totalmeal.get(listindex.geti()-1).getp();
		name = menu.totalmeal.get(listindex.geti()-1).getn();
		path = menu.totalmeal.get(listindex.geti()-1).getpath();
		type = menu.totalmeal.get(listindex.geti()-1).gett();
		if(menu.totalmeal.get(listindex.geti()-1).getb() == true)breakfast = "早餐";
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton back = new JButton("\u8FD4\u56DE");
		back.setFont(new Font("繚L糧n瞼聶繞��", Font.PLAIN, 16));
		back.setBounds(10, 10, 85, 23);
		contentPane.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				o1 order = new o1(menu);
				order.setVisible(true);
				dispose();
			}
		});

		JButton confirmbutton = new JButton("\u78BA\u8A8D\u9910\u9EDE");
		confirmbutton.setFont(new Font("DialogInput", Font.PLAIN, 16));
		confirmbutton.setBounds(252, 222, 191, 31);
		contentPane.add(confirmbutton);
		confirmbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.add(listindex,quantity);
				o1 order = new o1(menu);
				order.setVisible(true);
				dispose();
			}
		});

		JLabel prcielabel = new JLabel("\u50F9\u683C: "+Integer.toString(price));
		prcielabel.setFont(new Font("DialogInput", Font.PLAIN, 20));
		prcielabel.setBounds(252, 65, 170, 23);
		contentPane.add(prcielabel);

		JLabel namelabel = new JLabel("\u9910\u9EDE: "+name);
		namelabel.setFont(new Font("DialogInput", Font.PLAIN, 20));
		namelabel.setBounds(252, 31, 155, 24);
		contentPane.add(namelabel);

		JButton less = new JButton("-");
		less.setFont(new Font("繚s簡�怔疑�", Font.PLAIN, 20));
		less.setBounds(252, 176, 46, 23);
		contentPane.add(less);
		less.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(quantity>0)quantity--;
				q.setText(String.valueOf(quantity));
			}
		});

		JButton add = new JButton("+");
		add.setFont(new Font("繚s簡�怔疑�", Font.PLAIN, 20));
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
		q.setFont(new Font("繚s簡�怔疑�", Font.PLAIN, 16));
		q.setBounds(319, 176, 59, 20);
		contentPane.add(q);

		JLabel img = new JLabel();
		img.setIcon(new ImageIcon(path));
		img.setBounds(10, 43, 226, 199);
		contentPane.add(img);
		
		JLabel typelabel = new JLabel("類型:"+type);
		typelabel.setFont(new Font("DialogInput", Font.PLAIN, 20));
		typelabel.setBounds(252, 98, 155, 24);
		contentPane.add(typelabel);
		
		JLabel Breakfastlabel = new JLabel(breakfast);
		Breakfastlabel.setFont(new Font("DialogInput", Font.PLAIN, 20));
		Breakfastlabel.setBounds(252, 131, 155, 24);
		contentPane.add(Breakfastlabel);

	}

}
