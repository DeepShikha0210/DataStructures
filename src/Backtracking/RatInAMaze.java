package Backtracking;

public class RatInAMaze {

    public static boolean ratInAMaze(int maze[][]) {

        int[][] path = new int[maze.length][maze[0].length];
        return ratInAMaze(maze, 0,0, path);
    }

    public static boolean ratInAMaze(int maze[][] , int i, int j, int[][] path){

        int n = maze.length;

        if( i< 0 || i >= n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1)
            return false;

        if(i == n-1 && j == n-1)
            return true;


        path[i][j] = 1;

        if (ratInAMaze(maze, i, j + 1, path))
            return true;

        if (ratInAMaze(maze, i + 1, j, path))
            return true;

        if (ratInAMaze(maze, i - 1, j, path))
            return true;

        if (ratInAMaze(maze, i, j - 1, path))
            return true;

        return false;

    }

    public static void main(String[] args) {

        int maze[][] = { { 1, 0, 1},
                { 1, 0, 1},
                { 1, 1, 0 },
                { 1, 0, 1}};

        System.out.println(ratInAMaze(maze));

    }
}
