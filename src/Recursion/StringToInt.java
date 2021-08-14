package Recursion;

public class StringToInt {
    public static int convertStringToInt(String input){
        // Write your code here


        while(input.length() != 0 && input.charAt(0) == '0')
            input=input.substring(1);



        if(input.length() == 0)
            return 0;

        return convertStringToInt(input,  0,input.length()-1);
    }

    public static int convertStringToInt(String input , int number,int power){

        if(input.length() == 0 ||  power < 0)
            return number;

        number+= (input.charAt(0)-48)*Math.pow(10, power);
        return convertStringToInt(input.substring(1), number, power-1);

    }

    public static int stringToInt(String input){
        if(input.length() == 1)
            return input.charAt(0)-'0';

        int smallOutput = stringToInt(input.substring(0, input.length()-1));
        int lastDigit = input.charAt(input.length()-1) - '0';
        return smallOutput*10 + lastDigit;
    }
}
