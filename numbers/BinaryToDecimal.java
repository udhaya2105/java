import java.util.Scanner;
class BinaryToDecimal
{
public static int power(int base,int power)
{
int res=1;
for(int i=1;i<=power;i++)
{
res=res*base;
}
return res;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a binary number:");
int n=sc.nextInt();
int power=0;
int sum=0;
while(n!=0)
{
int digit=n % 10;
if(digit==1)
{
sum=sum+digit*power(2,power);
}
power++;
n=n/10;
}
System.out.println("Decimal value =" + sum);
}
}