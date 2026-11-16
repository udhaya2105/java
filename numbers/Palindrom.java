import java.util.*;
public class Palindrom{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int n=sc.nextInt();
int rev=0;
int temp=n;
while(n!=0)
{
int last=n%10;
rev=rev*10+last;
n=n/10;
}
if(temp==rev)
{
System.out.println("Palindrom");
}
}
}