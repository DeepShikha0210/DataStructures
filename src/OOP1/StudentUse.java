package OOP1;

import java.util.Scanner;

public class StudentUse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Student s1 = new Student();             // When there is no constructor created
        //System.out.println(s1.getName());         //NULL- Prints default value from the 'default' constructor
        //System.out.println(s1.getRollNo());       //0   - Prints default value from the default constructor

        Student s1 = new Student("Deep", 12);   // Created object with initial values as there is a constructor initialised

        // s1.name = "Deep";           // Accessible when the access specifier is default
        // s1.rollNo = 10;             // when access specifier is default

        s1.setName("Deepshikha");      // Private field accessed using getters and setters
        s1.setRollNo(10);

       // Student s2 = new Student();
        //s1.setName("Deep");           // Private field accessed using getters and setters
        //s1.setRollNo(11);

        System.out.println(Student.getNumOfStudents());
    }
}
