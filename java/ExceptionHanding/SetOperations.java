package ExceptionHanding;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetOperations {
public static void main(String[] args) {
//	HashSet<Integer> s=new HashSet<Integer>();
//	s.add(10);
//	s.add(null);
//	s.add(20);
//	s.add(30);
//	s.add(40);
//	s.add(50);
//	System.out.println(s);
//	s.remove(10);
//	System.out.println(s);
//	LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
//	l.add(10);
//	l.add(null);
//	l.add(20);
//	l.add(30);
//	l.add(40);
//	l.add(50);
//	System.out.println(l);
	TreeSet<Integer> t=new TreeSet<Integer>();
	t.add(10);
//	t.add(null);
	t.add(20);
	t.add(30);
	t.add(40);
	t.add(50);
	System.out.println(t);
	TreeSet t1=new TreeSet();
	t1.add("Udhaya");
	t1.add('M');
	t1.add(67.5);
	t1.add(23);
	System.out.println(t1);
	
}
}
