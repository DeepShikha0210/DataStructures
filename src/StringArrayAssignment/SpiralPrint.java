package StringArrayAssignment;

public class SpiralPrint {

    public static void spiralPrint(int mat[][]){
        //Your code goes here

        if(mat.length == 0)
            return;

        int top = 0;
        int bottom = mat.length-1;
        int left = 0;
        int right = mat[0].length-1;

        int count =0;
        int i = top, j = left;

        while(left <= right && top <= bottom){

            i=top;
            j=left;
            top++;

            while(j <= right){
                System.out.print(mat[i][j] + " ");
                j++;
            }

            i=top;
            j=right;
            right--;

            while(i <= bottom){
                System.out.print(mat[i][j] + " ");
                i++;
            }

            i=bottom;
            j=right;
            bottom--;

            while(j >= left){
                System.out.print(mat[i][j] + " ");
                j--;
            }

            i=bottom;
            j=left;
            left++;

            while(i >= top){
                System.out.print(mat[i][j] + " ");
                count++;
                i--;
            }

        }
    }
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        spiralPrint(a);

    }
}
