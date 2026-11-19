import java.util.Arrays;

public class CopyPrimeElementtoNewArray {
public static boolean isPrime(int ele) {
	int count=0;
	for(int i=1;i<=ele;i++) {
		if(ele%i==0) {
			count++;
		}
	}
	return count==2;
}
	public static void main(String[] args) {
		int a[]= {13,12,15,43,31,50};
		int count=0;
		for(int ele:a) {
			if(isPrime(ele))
				count++;
		}
		int b[]=new int[count];
		int index=0;
		for(int i=0;i<=a.length-1;i++) {
			if(isPrime(a[i])) {
				b[index++]=a[i];
			}
		}
System.out.println(Arrays.toString(a));
System.out.println(Arrays.toString(b));

	}

}
