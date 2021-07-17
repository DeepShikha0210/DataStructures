package StringArrayAssignment;

public class WavePrint {
    public static void wavePrint(int mat[][]){

        if(mat.length == 0)
            return;

        int top = 0;
        int bottom = mat.length-1;
        int left = 0;
        int right = mat[0].length-1;


        int count =0;
        int i = top, j = left;

        while(count != (mat.length*mat[0].length)){

            while(i <= bottom && j<= right){
                System.out.print(mat[i][j] + " ");
                count++;
                i++;
            }

            j++;
            i=bottom;

            while(i >=top && j<= right){
                System.out.print(mat[i][j] + " ");
                count++;
                i--;
            }

            j++;
            i = top;
        }
    }

    public static void main(String[] args) {

    }
}
