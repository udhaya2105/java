import java.util.*;
public class SmallestNumber{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int n=sc.nextInt()
int smallest=n%10;
while(n!=0)
{
int last=n%10;
if(last<smallest)
{
smallest=last;
}
n/=10;
}
System.out.println(smallest);
}
}