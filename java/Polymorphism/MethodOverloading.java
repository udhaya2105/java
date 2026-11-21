package Polymorphism;

public class MethodOverloading {
public static void txt()
{
	System.out.println("Hello");
}
public static void txt(String name)
{
	System.out.println("Hello:"+name);
}
public static void txt(String fname,String lname)
{
	System.out.println("Hello:"+fname+lname);
}
public static void main(String[] args) {
	System.out.println("start");
	txt();
	txt("Udhaya");
	txt("Udhaya","M");
	System.out.println("End");
}
}
