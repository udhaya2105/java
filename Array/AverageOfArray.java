import java.util.Arrays;
public class AverageOfArray {
	public static void main(String[] args) {
		int a[]= {10,20,30};
		int sum=0;
		for(int ele:a) {
			sum+=ele;
		}
		double avg=sum/a.length;
		System.out.println(avg);
//		System.out.println(Arrays.toString(a));
//		System.out.println(sum);
//		System.out.println(product);
	}
}

