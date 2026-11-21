package Interface;

public class Driver {
	public static void main(String[] args) {
		Sample s1=new Sample();
				s1.abs();
		        s1.pqs();
	}

}
interface Demo
{
	void abs();
	default void def()
	{
		System.out.println("from Default nonstatic method");
	}
	public static void xyz()
	{
		System.out.println("from static method with implementation");
	}
}
class Sample implements Demo
{
	@Override
	public void abs()
	{
		System.out.println("from abc");
	}
	public void pqs()
	{
		System.out.println("from pqs");
	}
}

