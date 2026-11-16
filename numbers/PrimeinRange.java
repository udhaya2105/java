import java.util.*;
public class PrimeinRange{
public static boolean isPrime(int n)
{
int count=0;
for(int i=1;i<n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2){
return true;
}
else{
return false;
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Starting value");
int start=sc.nextInt();
System.out.println("Enter ending value");
int end=sc.nextInt();
for(int i=start;i<end;i++)
{
boolean b=isPrime(i);
if(b==true)
{
System.out.println(i);
}
}
}
}