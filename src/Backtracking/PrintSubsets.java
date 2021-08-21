package Backtracking;

public class PrintSubsets {

    public static void printSubsets(int[] input){
        int[] output = new int[0];
        printSubsetsHelper(input, 0, output);
    }

    public static void printSubsetsHelper(int[] input, int beginIndex, int[] output) {
        if (beginIndex == input.length) {
            for (int i : output)
                System.out.print(i + " ");
            System.out.println();
            return;
        }

        int[] newOutput = new int[output.length + 1];
        int i = 0;
        for (; i < output.length; i++)
            newOutput[i] = output[i];

        newOutput[i] = input[beginIndex];
        printSubsetsHelper(input, beginIndex + 1, output);
        printSubsetsHelper(input, beginIndex + 1, newOutput);
    }
}
