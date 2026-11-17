import java.util.Arrays;


public class EvenElementOfArray {
public static void main(String[] args) {
	int[]a= {10,20,30,40,50};
	int count=0;
	for(int ele:a)
	{
		if(ele%2==0) {
			count++;
		
		}
	}
	System.out.println(Arrays.toString(a));
	System.out.println(count);
}
}
