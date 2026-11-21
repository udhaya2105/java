package Objectclass;

public class Bottle{
String color;
double capacity;
Bottle(String color,double capacity)
{
	this.color=color;
	this.capacity=capacity;
	
}
@Override
public boolean equals(Object o)
{ 
	Bottle b5=(Bottle)o;
	return this.color.equals(b5.color)&&this.capacity==b5.capacity;
	}
class Driver
{
	public static void main(String[] args) {
		Bottle b2=new Bottle("transparent",1.5);
		Bottle b3=new Bottle("transparent",1.5);
		System.out.println(b2.equals(b3));
	}
}
}
