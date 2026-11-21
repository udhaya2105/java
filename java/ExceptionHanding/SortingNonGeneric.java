package ExceptionHanding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingNonGeneric {
	public static void main(String[] args) {
		ArrayList a=new ArrayList(Arrays.asList(20,'A',60,false,50,70));
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
	}
}
