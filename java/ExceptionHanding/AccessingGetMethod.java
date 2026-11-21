package ExceptionHanding;

import java.util.ArrayList;
import java.util.Arrays;

public class AccessingGetMethod {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList(Arrays.asList(10,20,30,40,50,60,70));
	System.out.println(a);
//	System.out.println(a.get(3));
//	for(int i=0;i<=a.size()-1;i++)
//	{
//		System.out.println(a.get(i));
//	}
	for(int i=a.size()-1;i<=0
			;i++)
	{
		System.out.println(a.get(i));
	}
}
}
