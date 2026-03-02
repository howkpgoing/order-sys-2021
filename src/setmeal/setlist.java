package setmeal;

import java.util.ArrayList;  
import java.util.HashMap;

public class setlist{
  public HashMap <index,item> list = new HashMap<index,item>();
  public ArrayList<food> totalmeal = new ArrayList<food>();

  public void read(ArrayList <String>a){	//single meal
    if(a.size() == 5)
    {
      food singlemeal = new food(a.get(1),a.get(2),a.get(3),a.get(4));
      totalmeal.add(singlemeal);
      index listindex = new index(Integer.parseInt(a.get(0)),false);
      item meal = new item();
      list.put(listindex,meal);
    }
    else
    {
      set s = new set(a); 
      index listindex= new index(a.get(0),true);
      item meal = new item(s);
      list.put(listindex,meal);
    }
 }


  public void add(index listindex,int num)
  {
    if(num>0)list.get(listindex).add(num);
  }
  public void minus(index listindex, int num)
  {
    if(num<0)list.get(listindex).add(-num);
  }
  
  public void delete(index listindex)
  {
	  list.get(listindex).delete();
  } 


  public int total()
  { 
    int c = 0;
    for(int i = 1 ; i < 11 ;i++)
    {
        index p = new index(i,false);
        c += list.get(p).getq()*totalmeal.get(i-1).getp();
    }
    for(int i = 1 ; i <=3;i++)
    {
        index p = new index(i , true);
        c += list.get(p).getq()*list.get(p).getp();
    }
    return c;
  }


  public void setmealpath()
  {
      for(int i = 0; i< 10 ;i++)
      {
        totalmeal.get(i).setpath("D:\\Pic\\"+totalmeal.get(i).getn()+".jpg");
      }
  }


  public void setsetpath()
  {
      for(int i = 1;i <= 3;i++)
      {
        index p = new index(i , true);
        list.get(p).setpath("D:\\Pic\\"+list.get(p).getn()+".jpg");
      }
  }
}