import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import setmeal.index;
import setmeal.setlist;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class checkorder extends JFrame {

	private JScrollPane contentPane;
	JButton totalprice;
	JButton less[] = new JButton[10];
	JButton add[] = new JButton[10];
	
	index p;
	int count;
	setlist a;
	int q[] = new int[13];
	JLabel quantity[] = {new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel()};
	// array
	public checkorder(setlist menu) {
		a = menu;
		count = 0;
		load();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 800);
		contentPane = new JScrollPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton back = new JButton("back");
		back.setBounds(10, 10, 67, 23);
		contentPane.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				o1 order = new o1(menu);
				 order.setVisible(true);
				 dispose();
			}
		});
		
		for(int i = 1 ; i< 11 ;i++)
		{
								p = new index(i-1,false);
								final int final_i = i;
								if(q[i-1]>0)
								{
								JLabel mealname = new JLabel(" 餐點:"+a.totalmeal.get(i-1).getn()+"   價格:"+a.totalmeal.get(i-1).getp());
								mealname.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
								mealname.setBounds(93, 40+count*50, 157, 15);
								contentPane.add(mealname);
								
								quantity[i-1] = new JLabel(Integer.toString(q[i-1]));
								quantity[i-1].setHorizontalAlignment(SwingConstants.CENTER);
								quantity[i-1].setBounds(309, 40+count*50, 46, 15);
								contentPane.add(quantity[i-1]);
								
								less[i-1] = new JButton("-");
								less[i-1].setBounds(260,  40+count*50, 39, 23);
								contentPane.add(less[i-1]);
								less[i-1].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										p = new index(final_i,false);
										if(q[final_i-1]>0)q[final_i-1]--;
										quantity[final_i-1].setText(String.valueOf(q[final_i-1]));
										a.list.get(p).setq(q[final_i-1]);
										totalprice.setText("Total is = "+String.valueOf(a.total())+"     Order!");
									}
								});
								
								add[i-1] = new JButton("+");
								add[i-1].setBounds(364, 40+count*50, 46, 23);
								contentPane.add(add[i-1]);
								add[i-1].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										p = new index(final_i,false);
										q[final_i-1]++;
										quantity[final_i-1].setText(String.valueOf(q[final_i-1]));
										a.list.get(p).setq(q[final_i-1]);
										totalprice.setText("Total is = "+String.valueOf(a.total())+"     Order!");
									}
								});
								count++;
								}
								

		}
		for(int j = 1 ; j <=3 ;j++)
		{
			p = new index(j,true);
			final int final_j =j;
			System.out.println(q[12]);
			if(q[j+9] > 0)
			{
				JLabel setname = new JLabel("餐點:"+menu.list.get(p).getn()+" 價格"+menu.list.get(p).getp());
				setname.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
				setname.setBounds(93, 40+count*50, 157, 15);
				contentPane.add(setname);
				
				quantity[j+9] = new JLabel(Integer.toString(q[j+9]));
				quantity[j+9].setHorizontalAlignment(SwingConstants.CENTER);
				quantity[j+9].setBounds(309, 40+count*50, 46, 15);
				contentPane.add(quantity[j+9]);
				
				JButton lessforset = new JButton("-");
				lessforset.setBounds(260,  40+count*50, 39, 23);
				contentPane.add(lessforset);
				lessforset.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						p = new index(final_j,true);
						if(q[final_j+9]>0)q[final_j+9]--;
						quantity[final_j+9].setText(String.valueOf(q[final_j+9]));
						menu.list.get(p).setq(q[final_j+9]);
						totalprice.setText("Total is = "+String.valueOf(menu.total())+"     Order!");
					}
				});
				
				JButton addforset = new JButton("+");
				addforset.setBounds(364, 40+count*50, 46, 23);
				contentPane.add(addforset);
				addforset.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						p = new index(final_j,true);
						q[final_j+9]++;
						quantity[final_j+9].setText(String.valueOf(q[final_j+9]));
						menu.list.get(p).setq(q[final_j+9]);
						totalprice.setText("Total is = "+String.valueOf(menu.total())+"     Order!");
					}
				});
				count++;
			}
		}
			
			totalprice = new JButton("Total is = "+String.valueOf(menu.total())+"     Order!");
			totalprice.setBounds(30, 40+count*50, 373, 34);
			contentPane.add(totalprice);
			totalprice.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						recipt r =  new recipt(a);
						dispose();
				}
			});
			
			//down 50 
		}
	public void load()
	{
		for(int i = 1 ; i < 11 ;i++)
		{
			index p = new index(i,false);
			q[i-1] = a.list.get(p).getq();
		}
		for(int i = 1 ; i <=3;i++)
		{
			index p = new index(i,true);
			q[i+9] = a.list.get(p).getq();
		}
	}

}

