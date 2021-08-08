package Recursion;

public class GeometricSum {
    static double answer =0;
    public static double findGeometricSum(int k){
        helper(0, k);
        return answer;
    }

    static void helper(int i , int k){

        if(i > k)
            return;
        answer+= 1.0/Math.pow(2,i);
        helper(i+1, k);
    }
    public static void main(String[] args) {

        System.out.println(findGeometricSum(3));

    }
}
