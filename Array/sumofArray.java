import java.util.Arrays;
import java.util.Scanner;
public class sumofArray {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
			int size=sc.nextInt();
			int [] arr=new int[size];
			System.out.println("Enter the elements of array");
			int sum=0;
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.println("Enter the"+i+"index element");
				arr[i]=sc.nextInt();
				sum=sum+arr[i];
			
			}
			System.out.println(sum);

		}

	}

