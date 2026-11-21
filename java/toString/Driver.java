package toString;

public class Driver {
	public static void main(String[] args) {
		Box b1=new Box(20,20.5);
		System.out.println(b1);
	}

}
class Box
{
	int price;
	double weight;
	Box(int price,double weight)
	{
		this.price=price;
		this.weight=weight;
	}
	@Override
	public String toString()
	{
		return this.price+"-"+this.weight;
	}
}