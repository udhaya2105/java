class Fibonacci
{
public static void main(String[] args)
{
int a=0;
int b=1;
int n=7;
for(int i=1;i<=n;i++)
{
System.out.println(a);
int c=a+b;
a=b;
b=c;
}
}
}