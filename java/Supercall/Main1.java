package Supercall;

public class Main1 {
	public static void main(String[] args) {
        new Car();
}
}
class Vehicle {
    Vehicle(String brand) {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends Vehicle {
    Car() {
        super("Toyota");
        System.out.println("This is a Car");
    }
}