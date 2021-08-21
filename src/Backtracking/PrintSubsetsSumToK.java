package Backtracking;

public class PrintSubsetsSumToK {
    public static void printSubsetsSumK(int[] input, int k){
        int[] output = new int[0];
        printSubsetsSumKHelper(input, 0, output,k);
    }

    public static void printSubsetsSumKHelper(int[] input, int beginIndex, int[] output,  int k) {
        if (beginIndex == input.length) {
            if (k == 0) {
                for (int i : output)
                    System.out.print(i + " ");
                System.out.println();
                return;
            } else
                return;
        }

        int[] newOutput = new int[output.length + 1];
        int i = 0;
        for (; i < output.length; i++)
            newOutput[i] = output[i];

        newOutput[i] = input[beginIndex];
        printSubsetsSumKHelper(input, beginIndex + 1, output, k);
        printSubsetsSumKHelper(input, beginIndex + 1, newOutput, k - input[beginIndex]);
    }

}
