package Polymorphism;

public class Child extends Parent{

    public static void foo(){
        System.out.println("foo in child");
    }

    public void bar() {
        System.out.println("bar in child");
    }

    public static void main(String[] args) {
        Parent par = new Child();
        Child child = new Child();
        par.foo();
        par.bar();
        child.foo();
        child.bar();


    }
}
