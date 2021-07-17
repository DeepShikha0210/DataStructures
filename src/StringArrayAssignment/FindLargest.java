package StringArrayAssignment;

public class FindLargest {
    public static void findLargest(int input[][]){
        //Your code goes here
        int m=input.length;

        int max = Integer.MIN_VALUE;
        int q = 0;
        String s = "";
        if(m == 0){
            System.out.println("row" + " "  + q + " " + max);
            return;
        }
        int n=input[0].length;

        for(int i=0; i<m; i++)
        {
            int sum=0;
            for(int j=0; j<n; j++)
            {
                sum =sum +input[i][j];

            }
            if(sum>max){
                max = sum;
                q = i;
                s = "row";
            }
        }
        for(int i=0; i<n; i++)
        {
            int sum=0;
            for(int j=0; j<m; j++)
            {
                sum=sum +input[j][i];

            }
            if(sum>max){
                max = sum;
                q = i;
                s = "column";
            }
        }
        System.out.println(s + " "  + q + " " + max);
    }
}
