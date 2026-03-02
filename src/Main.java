
import java.util.ArrayList;
import java.util.Arrays;

import setmeal.setlist;

import java.io.*;

class Main {
	public static void main(String[] args) {
		setlist menu = new setlist();
		readsiglemeal(menu);// read csv to orderlist
		menu.setmealpath();// give Iconpath
		readsetmeal(menu);// read csv to set list
		menu.setsetpath();// give Iconpath
		begin window = new begin(menu);
		window.setVisible(true);
		// recipt r= new recipt();

	}// code

	static void readsiglemeal(setlist menu) // opencsv
	{
		try {
			InputStreamReader br = new InputStreamReader(new FileInputStream("Single_meal.csv"));
			BufferedReader reader = new BufferedReader(br);
			String line = null;
			int c =0;
			while ((line = reader.readLine()) != null) {
				if(c!=0)
				{
					String input[] = line.split(",");
					ArrayList<String> item = new ArrayList<String>();
					for(String s : input)
					{
						item.add(s);
					}
					menu.read(item);
			}
				c++;
			}
			br.close();
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static void readsetmeal(setlist menu) {
		try {
			InputStreamReader br = new InputStreamReader(new FileInputStream("D://Set_meal.csv"));// 瑼����楝敺�
			BufferedReader reader = new BufferedReader(br);
			String line = null;
			int c =0;
			while ((line = reader.readLine()) != null) {
				if(c!=0)
				{
					String input[] = line.split(",");
					ArrayList<String> item = new ArrayList<String>();
					for(String s : input)
					{
						if(s=="")s ="0";
						item.add(s);
					}
					menu.read(item);
			}
				c++;
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}