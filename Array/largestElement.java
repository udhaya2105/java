import java.util.*;
public class largestElement {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int largest=a[0];
	for(int ele:a)
	{
		if(ele>largest) {
			largest=ele;
		}
	}
	System.out.println(largest);
}
}
