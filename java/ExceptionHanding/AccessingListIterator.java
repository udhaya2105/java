package ExceptionHanding;
import java.util.*;
import java.util.ListIterator;

public class AccessingListIterator {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList();
	a.add(10);
    a.add(20);
    a.add(30);
    a.add(40);
    a.add(50);
    System.out.println(a);
    ListIterator<Integer> li=a.listIterator(a.size());
    System.out.println(li.hasPrevious());
    System.out.println(li.previous());
}
}

