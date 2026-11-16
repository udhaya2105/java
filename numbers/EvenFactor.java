import java.util.*;
public class EvenFactor
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int check=0;
for(int i=1;i<=n;i++)
{
if(n%i==0&&i%2==0)
{
System.out.println(i);
check++;
}
}
if(check==0)
{
System.out.println("Not Exist");
}
}
}
