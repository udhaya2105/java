package Abstract;

public class Driver {
	public static void main(String[] args) {
		Example e1=new Example();
		e1.display();
	}

}
abstract class Demo
{
	abstract public void display();
	public void test()
	{
		System.out.println("From Demo");
	}
}
class Example extends Demo
{ @Override
	public void display() {
	System.out.println("Hello");
}
}
