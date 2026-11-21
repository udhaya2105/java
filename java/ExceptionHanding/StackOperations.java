package ExceptionHanding;
import java.util.*;
public class StackOperations {
 public static void main(String[] args) {
	Stack<Integer> s=new Stack<Integer>();
	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);
	System.out.println(s);
	System.out.println(s.peek());
	System.out.println(s.pop());
	System.out.println(s);
	for(int ele:s)
	{
		System.out.println(ele);
	}
	
	
	
}
}
