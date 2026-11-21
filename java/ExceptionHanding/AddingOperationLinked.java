package ExceptionHanding;

import java.util.*;

public class AddingOperationLinked {
public static void main(String[] args) {
	    LinkedList<Integer> a=new LinkedList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);			
		a.add(50);
		System.out.println(a);
		a.add(2,60);
		System.out.println(a);
	    LinkedList<Integer> b=new LinkedList();
	    b.add(60);
	    b.add(70);
	    b.add(80);
	    System.out.println(b);
	    a.addAll(b);
	    a.addAll(1,b);
	    System.out.println(a);
  	    System.out.println(b);
}
}


	    	  