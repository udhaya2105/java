import java.util.Arrays;

public class SumandProductOfArray {
public static void main(String[] args) {
	int a[]= {10,20,30};
	int sum=0;
	int product=1;
	for(int ele:a) {
		sum+=ele;
		product*=ele;
	}
	System.out.println(Arrays.toString(a));
	System.out.println(sum);
	System.out.println(product);
}
}
