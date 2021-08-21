package Backtracking;

public class RatMazeAllPaths {

    public static void ratInAMaze(int[][] maze, int n){

        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Print output as specified in the question
         */
        int[][] path = new int[n][n];
        solveMaze(maze,0,0,path,n);

    }

    public static void solveMaze(int[][] maze, int i, int j, int[][] path, int n)
    {
        //Check if i,j are valid pair of indices => i,j>=0
        if (i<0 || j<0 || i>=n || j>=n)
            return;

        //If cell is already part of the path
        if (path[i][j]==1)
            return;

        //If cell is blocked in maze (cell value=0)
        if (maze[i][j]==0)
            return;

        //If all previous conditions fail, then the cell is a possible path
        //Include the cell in current path
        path[i][j]=1;

        //If we have reached ending point
        if (i==n-1 && j==n-1)
        {
            for (int row=0;row<n;row++)
            {
                for (int col=0;col<n;col++)
                {
                    System.out.print(path[row][col]+" ");
                }
            }
            System.out.println();
            path[i][j]=0;
            return;
        }
        //Changing the recursive calls to find all the paths
        solveMaze(maze,i-1,j,path,n);
        solveMaze(maze,i,j+1,path,n);
        solveMaze(maze,i+1,j,path,n);
        solveMaze(maze,i,j-1,path,n);
        path[i][j]=0;
    }

    public static void main(String[] args) {

        int[][] maze= {
                { 1, 0, 1},
                { 1, 1, 1},
                { 1, 0, 1}
        };
        ratInAMaze(maze, 3);

    }
}
