package ExceptionHanding;
import java.util.*;
public class SearchingOperation {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList();
    a.add(10);
    a.add(20);
    a.add(30);
    a.add(40);
    a.add(10);
    a.add(50);
//System.out.println(a.contains(30));
    ArrayList<Integer> b=new ArrayList();
    b.add(30);
    b.add(50);
    b.add(10);
    System.out.println(a.indexOf(40));
    System.out.println(a.lastIndexOf(10));
    System.out.println(a.containsAll(b));
}
}

