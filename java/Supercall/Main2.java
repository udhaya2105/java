package Supercall;

class Main2 {
    public static void main(String[] args) {
        new Child1();
    }
}
class Parent1 {
    Parent1(int age) {
        System.out.println("Age: " + age);
    }
}
class Child1 extends Parent1 {
    Child1() {
        super(21);
    }
}

