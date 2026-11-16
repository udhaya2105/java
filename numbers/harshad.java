import java.util.*;
public class harshad{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int n=sc.nextInt();
int sum=0;
int temp=n;
while(n!=0)
{
int digit=n%10;
int sum=sum+digit;
int n=n/10;
}
if(temp%sum==0)
{
System.out.println("Harshad");
}
else
	{
	System.out.println(" Not Harshad");
	}
}
}

