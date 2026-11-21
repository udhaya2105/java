package ExceptionHanding;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AccessingNonGeneric {
	public static void main(String[] args) {
		ArrayList a=new ArrayList(Arrays.asList(10,20,30,40,50,60,70));
		for(Object ele:a) {
			System.out.println(ele);
		}
		ArrayList s=new ArrayList(Arrays.asList("hi",10,20.5,"hello"));
		for(Object ele:s) {
			System.out.println(ele);
		}
	}
}
