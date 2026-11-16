import java.util.*;
public class EvenNumberinRange{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the starting value");
int start=sc.nextInt()
System.out.println("Enter the ending value");
int end=sc.nextInt()
for(i=start;i<end;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}
