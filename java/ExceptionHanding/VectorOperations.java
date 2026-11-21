package ExceptionHanding;
import java.util.*;
public class VectorOperations {
public static void main(String[] args) {
	Vector<String> v=new Vector(Arrays.asList("Udhaya","Jestin","Sri","Kani","Raja"));
	System.out.println(v);
	Iterator<String> i=v.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	Collections.sort(v);
	System.out.println(v);
}
}
