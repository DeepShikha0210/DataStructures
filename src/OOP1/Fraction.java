package OOP1;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        if(denominator == 0){
            return;
        }
        this.denominator = denominator;
        simplify();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) throws ZeroDenominatorException {
        if(denominator == 0) {
            ZeroDenominatorException e = new ZeroDenominatorException();
            throw e;
        }
        this.denominator = denominator;
        this.simplify();
    }

    private void simplify(){
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for(int i=2; i< smaller; i++)
            if(numerator%i == 0 && denominator%i == 0)
                gcd =i;

        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }

    public void add(Fraction f2){
        this.numerator = this.numerator*f2.denominator + this.denominator*f2.numerator;
        this.denominator = this.denominator*f2.denominator;
        simplify();
    }

    public void multiply(Fraction f2){
        this.numerator = this.numerator*f2.numerator;
        this.denominator = this.denominator*f2.denominator;
        simplify();
    }

    public  static Fraction add(Fraction f1, Fraction f2){
        int newNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
        int newDen = f1.denominator*f2.denominator;
        Fraction f = new Fraction(newNum, newDen);
        return f;
    }



    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
