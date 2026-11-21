package Objectclass;

public class Car {
	String brand;
	int mileage;
	Car(String brand,int mileage)
	{
		this.brand=brand;
		this.mileage=mileage;
	}
	@Override
	public int hashCode()
	{
		int h1=brand.hashCode();
		int h2=mileage;
		return h1+h2;
	}
}

class CarDriver
{
	public static void main(String[] args) {
		Car c1=new Car("Tesla",8);
		Car c2=new Car("Benze",8);
		int hash1=c1.hashcode();
		int hash2=c2.hashCode();
		if(hash1==hash2) {
			System.out.println("Cars are same");
		}
		else
		{
			System.out.println("cars are different");
		}
		
	}
}
