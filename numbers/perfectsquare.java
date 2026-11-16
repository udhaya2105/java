import java.util.*;
public class perfectsquare{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
if(i*i==n)
{
System.out.println("Perfect square");
break;
}
else(i*i>n)
{
System.out.println("Not a perfect square");
return;
}
}
}
}



