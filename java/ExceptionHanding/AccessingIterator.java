package ExceptionHanding;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AccessingIterator {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList(Arrays.asList(10,20,30,40,50,60,70));
	
	Iterator<Integer> i=a.iterator();
	System.out.println(i.hasNext());
	System.out.println(i.next());
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	
}
}
