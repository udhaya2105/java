import java.util.*;
public class First {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the"+i+"index element");
			arr[i]=sc.nextInt();
		
		}
		System.out.println("The elements of array are");
		System.out.println(Arrays.toString(arr));

	}

}
