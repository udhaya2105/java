package ExceptionHanding;
import java.util.*;
public class AddingOperation {
      public static void main(String[] args) {
//		ArrayList<Integer> a=new ArrayList();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		a.add(50);
//		System.out.println(a);
////		a.add(2,60);
////		System.out.println(a);
//		ArrayList<Integer> b=new ArrayList();
//		b.add(60);
//		b.add(70);
//		b.add(80);
//		System.out.println(b);
////		a.addAll(b);
//		a.addAll(1,b);
//		System.out.println(a);
//		System.out.println(b);
//	}
//}
    	  ArrayList a=new ArrayList();
    	  a.add("Udhaya");
    	  a.add('M');
    	  a.add(77.6);
    	  a.add(true);
    	  System.out.println(a);
    	  ArrayList b=new ArrayList();
    	  b.add(60);
    	  b.add(70);
    	  b.add(80);
    	  System.out.println(b);
    	  a.addAll(b);
    	  System.out.println(a);
    	  System.out.println(b);
    	  a.addAll(2,b);
    	  System.out.println(a);
    	  
  	  a.add(2,8.0);
  	  System.out.println(a);
      }
}
