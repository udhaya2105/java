import java.util.*;
public class checkdigit{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
System.out.println("Enter the digit");
int digit=sc.nextInt();
while(n!=0)
{
int last=n%10;
if(last==digit)
{
System.out.println("Present");
return;
}
n/=10;
}
System.out.println("Not Present");
}
}