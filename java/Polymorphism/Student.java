package Polymorphism;
class MainDriver{
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(101);
		Student s3=new Student(102,"Rahul");
		s1.display();
		s2.display();
		s3.display();
		
		
	}
}
public class Student {
	int id;
	String name;
	Student(){
		this(0,"Unkown");
	}
	Student(int i)
	{
		this(i,"NotProvided");
	}
	Student(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+""+name);
	}
}




