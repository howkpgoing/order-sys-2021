import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

import setmeal.index;
import setmeal.setlist;

class recipt{
    public recipt(setlist a)
    {
          try{
                File writename = new File("receipt.txt"); 
                writename.createNewFile(); 
                BufferedWriter out = new BufferedWriter(new FileWriter(writename));
                out.write("recipet\n");
                out.write("---單點明細---\n");
                for(int i = 0 ; i < 10 ;i++)
                {
                  index j = new index(i+1,false);
                  if(a.list.get(j).getq()>0)
                  {
                    out.write(String.format("%s    %d份    %d元\n",a.totalmeal.get(i).toString(),a.list.get(j).getq(),a.list.get(j).getq()*a.totalmeal.get(i).getp()));
                  }

                }
                out.write("---------\n");
                out.write("---套餐明細---\n");
                for(int i = 0 ; i < 3 ;i++)
                {
                  index j = new index(i+1,true);
                  if(a.list.get(j).getq()>0)
                  {
                    String str="";
                    for(int q = 0 ; q < 3 ;q++)
                    {
                      if(a.list.get(j).getf().get(q)!=0)str+=a.totalmeal.get(a.list.get(j).getf().get(q)).getn();
                      str+=" ";
                    }
                    out.write(String.format("套餐:%s    備註:%s    %d份    %d元\n",a.list.get(j).getn(),str,a.list.get(j).getq(),a.list.get(j).getq()*a.list.get(j).getp()));
                  }
                }
                out.write("---------\n");
                out.write("總計金額: "+ a.total());
                //write the recipt
                out.flush(); 
                out.close();
                System.exit(0); 
          }catch (Exception e) {
          e.printStackTrace();
          }
    }
}