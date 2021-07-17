package Polymorphism;

public class Main {

    public static void main(String[] args) {
        Animals a = new Animals();
        Pig p = new Pig();
        Cow c = new Cow();

        System.out.println(a.sound());
        System.out.println(p.sound());
        System.out.println(c.sound());
    }
}
