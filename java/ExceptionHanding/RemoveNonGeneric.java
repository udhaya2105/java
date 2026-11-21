package ExceptionHanding;
import java.util.*;

public class RemoveNonGeneric {
	public static void main(String[] args) {
//		ArrayList a=new ArrayList(Arrays.asList("Udhaya","Jestin","Aathi","Kani"));
//		System.out.println(a);
//		System.out.println(a.remove("Aathi"));
//		System.out.println(a);
//		ArrayList b=new ArrayList();
//		b.add(20);
//		b.add(50);
//		b.add(10);
//		System.out.println(b);
//		System.out.println(b.remove(10));// if we pass interger it is internally consider as a index and character consider automaticaly askey value
//		System.out.println(b.remove(1));
//		System.out.println(b);
		 ArrayList a=new ArrayList(Arrays.asList(10,'M',25,false,50,'S',70));
		 ArrayList b=new ArrayList(Arrays.asList(30,'J',70,10));
		 System.out.println(a);
		 System.out.println(b);
//		 a.removeAll(b);
//		 a.retainAll(b);
		 if(!(a.isEmpty()))
		 {
			 a.clear();
		 }
		 System.out.println(a);
		 
	}
	}

}
