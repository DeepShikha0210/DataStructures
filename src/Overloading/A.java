package Overloading;

public class A {

    A(){
        this(0);
        System.out.println("Hi");
    }

    A(int x){
        this(0, 0);
        System.out.println("Hello");
    }

    A(int x, int y){
        System.out.println("How are you");
    }

    public static void main(String[] args) {
        A obj = new A();
    }

}
