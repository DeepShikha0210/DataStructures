package Recursion;

public class MultiplyTwoIntegers {

    static int answer=0;
    public static int multiplyTwoIntegers(int m, int n){
        return helper(0, m,n);
    }

    static int helper(int i, int m , int n){
        if(i == n)
            return answer;
        answer+=m;
        return helper(i+1, m, n);
    }

    public static int multiply(int m, int n){
        if(n ==0 || m==0)
            return 0;
        return m + multiply(m , n-1);
    }

    public static void main(String[] args) {

        System.out.println(multiplyTwoIntegers(3, 5));

    }
}
