import java.util.Scanner;
public class TwinPrime
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
int count=0,c= 0;
for (int i=1;i<=a;i++)
{
if(a%i==0)
count++;
}
for(int i=1;i<=b;i++)
{
if(b%i==0)
c++;
}
if((count==2&&c==2)&&(a-b==2||b-a==2))
{
System.out.println("Twin Prime Numbers");
}
else
{
System.out.println("Not Twin Prime Numbers");
}
}
}