package OOP1;

public class ComplexNumbers {

    private int real;
    private int imaginary;

    ComplexNumbers(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void print(){
        System.out.println(real + " + " + "i" + imaginary);
    }

    public void plus(ComplexNumbers c2){
        this.real = this.real + c2.real;
        this.imaginary= this.imaginary + c2.imaginary;
    }

    public void add(ComplexNumbers c2){
        this.real = this.real + c2.real;
        this.imaginary= this.imaginary + c2.imaginary;
    }

    public void multiply(ComplexNumbers c2){

        int real = (this.real*c2.real) + (-(this.imaginary*c2.imaginary));
        int imaginary = (this.real*c2.imaginary) + (this.imaginary*c2.real);

        this.real = real;
        this.imaginary = imaginary;

    }

    public ComplexNumbers conjugate(){
        ComplexNumbers c1 = new ComplexNumbers(this.real, -(this.imaginary));
        return c1;
    }

    public static ComplexNumbers add(ComplexNumbers c1, ComplexNumbers c2){
        int newReal = c1.real + c2.real;
        int newImaginary= c1.imaginary + c2.imaginary;
        ComplexNumbers c = new ComplexNumbers(newReal, newImaginary);
        return c;
    }
}
