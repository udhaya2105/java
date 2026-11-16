import java.util.*;
public class sunnynumber{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int n=sc.nextInt();
int res=n+1;
for(int i=1;i<=n;i++)
{
if(i*i==res)
{
System.out.println("sunny number");
break;
}
if(i*i>res)
{
System.out.println("Not a sunny number");
return;
}
}
}
}



