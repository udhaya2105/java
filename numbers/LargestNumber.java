import java.util.*;
public class LargestNumber{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int n=sc.nextInt()
int largest=n%10;
while(n!=0)
{
int last=n%10;
if(last>largest)
{
largest=last;
}
n/=10;
}
System.out.println(largest);
}
}