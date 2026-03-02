package setmeal;

public class meal {
		protected String name;
		protected int price;
		protected String path;
		
		public meal(String n ,int p)
		{
			setn(n);
			setp(p);
			setpath(path);
		}
		public void setn(String n) {name = n;}
		public void setp(int p) {price = p;}
		public void setpath(String p) {path = p;}
		
		public String getn() {return name;}
		public int getp(){return price;}
		public String getpath(){return path;}
}
