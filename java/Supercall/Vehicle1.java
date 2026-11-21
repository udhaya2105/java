package Supercall;

public class Vehicle1 {
	public static void main(String[] args) {
        new Carr();
    }
}

class Vehicles{
    Vehicles(String brand) {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Carr extends Vehicles{
    Carr() {
        super("Toyota");
        System.out.println("This is a Car");
    }
}


