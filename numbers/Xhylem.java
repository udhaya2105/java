import java.util.*;
public class Xhylem{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int sum=0;
int last=n%10;
n/=10;
while(n>9)
{
int digit=n%10;
sum+=digit;
n/=10;
}
int res=last+n;
if(res==sum)
{
System.out.println("Xhylem");
}
else
{
System.out.println("phloem");
}
}
}
