package Backtracking;

public class NumberofNumbers {
    public static long numberOfNumbersWithDuplicates(long num){
        int numDigits = (int)Math.log10(num) + 1;
        int[] digitCount = new int[10];
        int[] digits = new int[numDigits];
        for(int i = 0; i < digits.length; i++){
            digits[numDigits - i - 1] =(int)(num % 10);
            digitCount[(int)(num % 10)]++;
            num = num / 10;
        }
        long fact[] = new long[digits.length];
        fact[0] = 1;
        for(int i = 1; i < fact.length; i++){
            fact[i] = i*fact[i - 1];
        }
        return numberOfNumbersWithDuplicates(digits,digitCount,fact,0);
    }
    private static long numberOfNumbersWithDuplicates(int[] digits, int[] digitCount,
                                                      long[] fact, int beginIndex) {
        if(beginIndex >= digits.length - 1){
            return 0;
        }
        long count = 0;
        int currentDigit = digits[beginIndex];
        for(int i = currentDigit + 1; i < digitCount.length; i++){
            if(digitCount[i] > 0){
                long currentCount = fact[digits.length - beginIndex - 1] /
                        fact[digitCount[i] - 1];
                for(int j = 0; j < digitCount.length; j++){
                    if(i == j){
                        continue;
                    }
                    currentCount = currentCount / fact[digitCount[j]];
                }
                count += currentCount;
            }
        }
        digitCount[currentDigit]--;
        count += numberOfNumbersWithDuplicates(digits, digitCount, fact, beginIndex + 1);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfNumbersWithDuplicates(122));
    }
}
