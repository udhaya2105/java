import java.util.*;
public class NeonNumber{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int n=sc.nextInt();
int sum=0;
int square=n*n;
while(square!=0)
{
int digit=square%10;
sum=sum+digit;
n=n/10;
}
if(n==sum)
{
System.out.println("Neon");
}
else
	{
	System.out.println("Not Neon");
	}
}
}

