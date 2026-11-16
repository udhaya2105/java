public class Tech
{
public static void main(String[] args)
{
int n = 2025;
int temp = n;
int count = 0;
while (n != 0)
{
count++;
n/=10;
}
n=temp;
if(count%2==0)
{
int div=1;
for(int i=1;i<=count/2;i++)
{
div=div*10;
}
int last = n % div;
int first = n / div;
int sum = first + last;
int sqr = sum * sum;
if(sqr==temp)
{
System.out.println("Techno");
}
else
{
System.out.println("Not a Tech number");
}
}
}
}