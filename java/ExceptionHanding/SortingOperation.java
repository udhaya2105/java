package ExceptionHanding;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class SortingOperation {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList(Arrays.asList(20,40,60,30,50,70));
	System.out.println(a);
	Collections.sort(a);
	System.out.println(a);
	Collections.reverse(a);
	System.out.println(a);
}
}
