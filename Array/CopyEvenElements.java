import java.util.Arrays;

public class CopyEvenElements {

	public static void main(String[] args) {
		int arr[]= {16,19,22,23,24,44,14};
		int count=0;
		for(int ele:arr) {
			if(ele%2==0) {
				count++;
			}
		}
		int brr[]=new int[count];
		int index=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0) {
				brr[index]=arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(brr));

	}

}
