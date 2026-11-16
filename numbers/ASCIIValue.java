import java.util.Scanner;
class ASCIIValue
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String s=sc.nextLine();
for(int i=0;i<=s.length()-1;i++)
{
char c=s.charAt(i);
System.out.println((int)c);
}
}
}