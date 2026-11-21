package Supercall;

public class Emp {
	public static void main(String[] args) {
        new Developer();
    }
}

class Employee {
    Employee(String name, int id) {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Developer extends Employee {
    Developer() {
        super("Udhaya", 101);
        System.out.println("Role: Developer");
    }
}

