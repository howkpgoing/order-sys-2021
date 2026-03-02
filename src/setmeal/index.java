package setmeal;

import java.util.HashMap;

public class index {
	HashMap <String,Integer>map=  new HashMap<String,Integer>();
	int id;
	boolean isset;
	public index(String c, boolean b) {
		map.put("A",1);
		map.put("B",2);
		map.put("C",3);
		id = map.get(c);
		isset = b;
	}
	// index p =new index(1,false);
	// map.set(p)
	public index(int i, boolean b) {
		id = i;
		isset = b;
	}

	public int geti() {
		return id;
	}

	public boolean getb() {
		return isset;
	}
	@Override
	 public int hashCode() {
		  	int value;
		  	if(this.isset == true)value = this.id+10;
		  	else value = this.id;
	        return value;
	    }
	@Override
	public boolean equals(final Object p) {
	        if (p == null)
	            return false;
	        index temp = (index) p;
	        if(temp.id != this.id)
	        	return false;
	        if(temp.isset != this.isset)
	        	return false;
	        return true;
	    }

}