package ExceptionHanding;
import java.util.*;
public class HashMapOperations {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(18,"Virat");
		h.put(45,"Rohit");
		h.put(7,"Dhoni");
		h.put(17,"Develliers");
		h.put(1,"Rahul");
		System.out.println(h);
		System.out.println(h.get(18));
		for(int key:h.keySet())
		{
			System.out.println(h.get(key));
		}
		System.out.println(h.containsKey(17));
		System.out.println(h.containsValue("Rohit"));
		h.replace(1,"Rahul Dravid");
		System.out.println(h);
		h.remove(17);
		System.out.println(h);
	}

}
