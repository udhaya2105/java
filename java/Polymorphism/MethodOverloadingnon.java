package Polymorphism;

public class MethodOverloadingnon {
	
	public void txt()
	{
		System.out.println("Hello");
	}
	public void txt(String name)
	{
		
		
		System.out.println("Hello:"+name);
	}
	public void txt(String fname,String lname)
	{
		System.out.println("Hello:"+fname+lname);
	}
	
	public static void main(String[] args) {
	MethodOverloadingnon m1=new MethodOverloadingnon();
	m1.txt();
	m1.txt("udhaya");
	m1.txt("udhaya","M");
	
	}

}
