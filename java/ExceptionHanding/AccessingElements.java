package ExceptionHanding;
import java.util.*;
import java.util.Arrays;

public class AccessingElements {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList(Arrays.asList(10,20,30,40,50,60,70));
	for(int ele:a) {
		System.out.println(ele);
	}
	ArrayList<String> s=new ArrayList(Arrays.asList("hi","hello"));
	for(String ele:s) {
		System.out.println(ele);
	}
}
}
