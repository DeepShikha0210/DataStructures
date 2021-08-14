package OOP1;

public class Student {
     private String name;
    private int rollNo;

    private static int numOfStudents;

    public Student(String nm, int rn){
        name = nm;
        rollNo = rn;
        numOfStudents++;
    }

    public static int getNumOfStudents() {
        return numOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
