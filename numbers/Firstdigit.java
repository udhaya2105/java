import java.util.*;
public class Firstdigit{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int n=sc.nextInt();
while(n>9)
{
n/=10;
}
System.out.println(n);
}
}
