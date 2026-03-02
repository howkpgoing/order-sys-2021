package setmeal;

import java.util.ArrayList;  

public class set extends meal{
  private ArrayList<Integer> foodindex;
  public set(ArrayList<String>a)
  {
      super(a.get(1),Integer.parseInt(a.get(5)));
      ArrayList<Integer> index = new ArrayList<Integer>();
      index.add(Integer.parseInt(a.get(2)));
      index.add(Integer.parseInt(a.get(3)));
      index.add(Integer.parseInt(a.get(4)));
      setf(index);
  }
    public void setf(ArrayList<Integer> f){foodindex=f;}

    public ArrayList<Integer> getf(){return foodindex;}

}