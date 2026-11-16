import java.util.*;
public class odddigit
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int check=0;
while(n!=0)
{
int last=n%10;
if(last%2==1)
{
System.out.println(last);
check++;
}
n/=10;
}
if(check==0)
{
System.out.println("Not Exist");
}
}
}
