import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import setmeal.index;
import setmeal.setlist;

public class o1 extends JFrame {

	private JPanel contentPane;
	JFrame f = new JFrame();
	JScrollPane jScrollPane = new JScrollPane(contentPane);
	setlist a;
	/**
	 * Create the frame.
	 */
	public o1(setlist menu) {
		a= menu;
		Container cp=f.getContentPane();
		cp.add(jScrollPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 909);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		f.getContentPane().setLayout (null);
		f.setDefaultLookAndFeelDecorated(true);
		
		JLabel page1 = new JLabel("\u55AE\u9EDE");
		page1.setHorizontalAlignment(SwingConstants.CENTER);
		page1.setFont(new Font("DialogInput", Font.PLAIN, 14));
		page1.setBounds(206, 10, 118, 15);
		contentPane.add(page1);
		
		JButton meal1 = new JButton("\u85AF\u689D(\u5C0F)");
		meal1.setBounds(87, 35, 358, 38);
		contentPane.add(meal1);
		meal1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 index p = new index(1,false);
				 confirmscreen c = new confirmscreen(a,p);
				 c.setVisible(true);
				 dispose();
			}
		});
		
		JButton meal2 = new JButton("\u9EA5\u9999\u96DE");
		meal2.setBounds(87, 85, 358, 38);
		contentPane.add(meal2);
		meal2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index p = new index(2,false);
				confirmscreen c = new confirmscreen(a,p);
				c.setVisible(true);
				dispose();
			}
		});
		
		JButton meal3 = new JButton("\u53EF\u6A02(\u5C0F)");
		meal3.setBounds(87, 135, 358, 38);
		contentPane.add(meal3);
		meal3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index p = new index(3,false);
				 confirmscreen c = new confirmscreen(a,p);
				 c.setVisible(true);
				dispose();
			}
		});
		
		JButton meal4 = new JButton("\u96EA\u78A7(\u5C0F)");
		meal4.setBounds(87, 185, 358, 38);
		contentPane.add(meal4);
		meal4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index p = new index(4,false);
				 confirmscreen c = new confirmscreen(a,p);
				 c.setVisible(true);
				dispose();
			}
		});
		
		JButton meal5 = new JButton("\u85AF\u689D(\u4E2D)");
		meal5.setBounds(87, 235, 358, 38);
		contentPane.add(meal5);
		meal5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index p = new index(5,false);
				 confirmscreen c = new confirmscreen(a,p);
				 c.setVisible(true);
				dispose();
			}
		});
		
		JButton meal6 = new JButton("\u85AF\u9905");
		meal6.setBounds(87, 285, 358, 38);
		contentPane.add(meal6);
		meal6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index p = new index(6,false);
				 confirmscreen c = new confirmscreen(a,p);
				 c.setVisible(true);
				dispose();
			}
		});
		
		JButton meal7 = new JButton("\u6EFF\u798F\u5821");
		meal7.setBounds(87, 335, 358, 38);
		contentPane.add(meal7);
		meal7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index p = new index(7,false);
				 confirmscreen c = new confirmscreen(a,p);
				 c.setVisible(true);
				dispose();
			}
		});
		
		JButton meal8 = new JButton("\u85AF\u689D(\u5927)");
		meal8.setBounds(87, 385, 358, 38);
		contentPane.add(meal8);
		meal8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index p = new index(8,false);
				 confirmscreen c = new confirmscreen(a,p);
				 c.setVisible(true);
				dispose();
			}
		});
		
		JButton meal9 = new JButton("\u5927\u9EA5\u514B");
		meal9.setBounds(87, 435, 358, 38);
		contentPane.add(meal9);
		meal9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index p = new index(9,false);
				 confirmscreen c = new confirmscreen(a,p);
				 c.setVisible(true);
				dispose();
			}
		});
		
		JButton meal10 = new JButton("\u7389\u7C73\u6FC3\u6E6F");
		meal10.setBounds(87, 485, 358, 38);
		contentPane.add(meal10);
		meal10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index p = new index(10,false);
				 confirmscreen c = new confirmscreen(a,p);
				 c.setVisible(true);
				dispose();
			}
		});
		
		JLabel page3 = new JLabel("\u5957\u9910");
		page3.setHorizontalAlignment(SwingConstants.CENTER);
		page3.setFont(new Font("DialogInput", Font.PLAIN, 14));
		page3.setBounds(206, 535, 118, 15);
		contentPane.add(page3);
		
		JButton set1 = new JButton("\u666E\u901A\u5957\u9910");
		set1.setBounds(87, 585, 358, 38);
		contentPane.add(set1);
		set1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index p = new index(1,true);
				 confirmset c = new confirmset(a,p);
				 c.setVisible(true);
				dispose();
			}
		});
		
		JButton set2 = new JButton("\u85AF\u9905\u5957\u9910");
		set2.setBounds(87, 635, 358, 38);
		contentPane.add(set2);
		set2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index p = new index(2,true);
				confirmset c = new confirmset(a,p);
				 c.setVisible(true);
				dispose();
			}
		});
		
		JButton set3 = new JButton("\u5403\u5F88\u98FD\u5957\u9910");
		set3.setBounds(87, 685, 358, 38);
		contentPane.add(set3);
		set3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index p = new index(3,true);
				confirmset c = new confirmset(a,p);
				 c.setVisible(true);
				dispose();
			}
		});
		
		
		JButton tocheck = new JButton("\u7D50\u5E33");
		tocheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkorder check = new checkorder(a);//to check
				check.setVisible(true);
				dispose();
			}
		});
		tocheck.setBounds(480, 735, 90, 42);
		contentPane.add(tocheck);
		
		
		// only a configuration to the jScrollPane...
		jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		
		f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e) {
		    System.exit(0);
		}
		});
	}
}
