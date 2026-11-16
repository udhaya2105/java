import java.util.Scanner;
class GCDLCM
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int x=sc.nextInt();
int y=sc.nextInt();
int gcd=1;
for(int i=1;i<=x&&i<=y;i++)
{
if(x%i==0&&y%i==0)
{
gcd=i;
}
}
int lcm=(x*y)/gcd;
System.out.println("GCD = " + gcd);
System.out.println("LCM = " + lcm);
}
}