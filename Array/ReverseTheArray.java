import java.util.Arrays;

public class ReverseTheArray {
public static void main(String[] args) {
	int arr[]= {10,20,30,40};
	int brr[]=new int[arr.length];
	int index=0;
	for(int i=arr.length-1;i>=0;i--) {
		brr[index]=arr[i];
		index++;
	}
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(brr));
}
}
