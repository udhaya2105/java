import java.util.Scanner;
class Consonant
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String s=sc.nextLine();
int count=0;
for(int i=0;i<=s.length()-1;i++)
{
char c=s.charAt(i);
if(!(c=='A'||c=='E'||c=='I'||c =='O'||c=='U'||
   c=='a'||c=='e'||c=='i'||c=='o'||c=='u'))
{
count++;
}
}
System.out.println(count);
}
}