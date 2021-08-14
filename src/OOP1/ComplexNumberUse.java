package OOP1;

public class ComplexNumberUse {

	public static void main(String[] args) {
		ComplexNumbers c1 = new ComplexNumbers(2, 3);
		c1.print();
		
		c1.setReal(10);
		c1.setImaginary(30);
		c1.print();
		
		ComplexNumbers c2 = new ComplexNumbers(1,5);
		c1.add(c2);
		c1.print();
		c2.print();
		
		ComplexNumbers c3 = new ComplexNumbers(3,2);
		c3.multiply(c2);
		c3.print();
		c2.print();
		
		ComplexNumbers c4 = ComplexNumbers.add(c1, c3);
		c1.print();
		c3.print();
		c4.print();
		
		ComplexNumbers c5 = c1.conjugate();
		c5.print();
	}
}
