import java.util.*;
public class Automorphic{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int n=sc.nextInt();
int square=n*n;
while(n!=0)
{
int last1=n%10;
int last2=square%10;
if(last1!=last2)
{
System.out.println("Not Automarphic");
return;
}
n=n/10;
square=square/10;
}
System.out.println("Automarphic");
}
}

