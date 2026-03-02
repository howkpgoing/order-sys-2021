package setmeal;

import java.util.ArrayList;

public class item{
  private int quantity=0;
  private set setmeal;
  public item() {}
  public item(set m)
  {
      setm(m);
  }

  public void setq(int q) {quantity =q;}
  public void setm(set m){setmeal = m;}
  public void setn(String n){setmeal.setn(n);}
  public void setp(int p){setmeal.setp(p);}
  public void setf(ArrayList<Integer> f){setmeal.setf(f);;}
  public void setpath(String p){setmeal.setpath(p);;}
  
  public int getq(){return quantity;}
  public String getn(){return setmeal.getn();}
  public int getp(){return setmeal.getp();}
  public ArrayList<Integer> getf(){return setmeal.getf();}
  public String getpath(){return setmeal.getpath();}
  public void add(int num)
  {
    quantity+=num;
  }
  public void delete()
  {
    quantity = 0;
  }

}