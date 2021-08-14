package OOP1;

public class Polynomial {

    private int[] coeffArray;
    private int degree;

    public Polynomial() {
        coeffArray=new int[5];
        degree=-1;
    }

    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */
    public void setCoefficient(int degree, int coeff){
        if(degree >=coeffArray.length) {
            restructure(degree);
        }
        coeffArray[degree]=coeff;
        if(degree >= this.degree) {
            this.degree=degree;
        }

    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        for(int i=0;i<coeffArray.length;i++) {
            if(coeffArray[i] !=0)
                System.out.print( coeffArray[i]  +"x"+ i +" ");
        }
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){

        Polynomial x=new Polynomial();

        int i=0,j=0,k=0;
        while(i < p.coeffArray.length && j < this.coeffArray.length) {
            x.setCoefficient(k, p.coeffArray[i] + this.coeffArray[i]);
            i++;
            j++;
            k++;
        }
        while(i<p.coeffArray.length) {
            x.setCoefficient(k, p.coeffArray[i]);
            k++;
            i++;
        }
        while(j<this.coeffArray.length) {
            x.setCoefficient(k, this.coeffArray[j]);
            k++;
            j++;
        }


        return x;

    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        Polynomial x=new Polynomial();

        int i=0,j=0,k=0;
        while(i < p.coeffArray.length && j < this.coeffArray.length) {
            x.setCoefficient(k,  this.coeffArray[i] - p.coeffArray[i] );
            i++;
            j++;
            k++;
        }
        while(i<p.coeffArray.length) {
            x.setCoefficient(k, -p.coeffArray[i]);
            k++;
            i++;
        }
        while(j<this.coeffArray.length) {
            x.setCoefficient(k, this.coeffArray[j]);
            k++;
            j++;
        }


        return x;

    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){

        Polynomial x=new Polynomial();

        for(int i=0;i<p.coeffArray.length;i++) {
            for(int j=0;j<this.coeffArray.length;j++) {
                if(i + j <=x.degree)
                    x.setCoefficient( i + j ,x.coeffArray[i+j]+p.coeffArray[i] * this.coeffArray[j]);
                else
                    x.setCoefficient(i + j ,p.coeffArray[i] * this.coeffArray[j]);
            }
        }
        return x;

    }

    private void restructure(int degree) {

        int[] temp=coeffArray;
        coeffArray=new int[degree + 1];
        for(int i=0;i<temp.length;i++) {
            coeffArray[i]=temp[i];
        }
    }


}
