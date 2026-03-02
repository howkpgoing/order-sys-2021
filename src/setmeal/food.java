package setmeal;

public class food extends meal{
  private String type;
  private boolean breakfast;
  protected food(String n, String p ,String t ,String b)
  {
	  super(n,Integer.parseInt(p));
      sett(t);
      setb(Boolean.parseBoolean(b));//string to boolean
  }
  public void sett(String t){type = t;}
  public void setb(boolean b){breakfast = b;}

  public String gett(){return type;}
  public boolean getb(){return breakfast;}
  public String toString()
  {
	  return String.format("品項: %s   價格:%d   類別:%s",name,price,type);
  }
}