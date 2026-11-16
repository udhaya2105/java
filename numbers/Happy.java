public class Happy
{
public static void main(String[] args)
{
int n=19;
while(n!=1&&n!=4)
{
int sum=0;
while(n!=0)
{
int last=n%10;
sum=sum+(last*last);
n/=10;
}
n=sum;
}
if(n==1)
{
System.out.println("Happy");
}
else
{
System.out.println("Sad");
}
}
}