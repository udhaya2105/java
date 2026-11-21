package ExceptionHanding;

import java.util.*;

public class SearchNonGeneric {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
	    a.add(10);
	    a.add('A');
	    a.add(30);
	    a.add(false);
	    a.add(10);
	    a.add(50);
	//System.out.println(a.contains(30));
	    ArrayList b=new ArrayList();
	    b.add(30);
	    b.add('A');
	    b.add(10);
	    System.out.println(a.indexOf(40));
	    System.out.println(a.lastIndexOf(10));
	    System.out.println(a.containsAll(b));
	}
}
