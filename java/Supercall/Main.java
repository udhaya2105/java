package Supercall;

public class Main {
	public static void main(String[] args) {
        new Child();
}
}
class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child Constructor");
    }
}

