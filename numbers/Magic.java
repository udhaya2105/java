public class Magic
{
public static void main(String[] args)
{
int n=9;
while(n>9)
{
int sum=0;
while(n!=0)
{
int last=n%10;
sum=sum+last;
n/=10;
}
n=sum;
}
if(n==1)
{
System.out.println("Magic");
}
else
{
System.out.println("Not a Magic Number");
}
}
}