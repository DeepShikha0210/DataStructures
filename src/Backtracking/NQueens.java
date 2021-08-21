package Backtracking;

public class NQueens {
    public static void placeNQueens(int n) {

        int[][] board = new int[n][n];
        placeNQueens(n, 0, board);

    }

    public static void placeNQueens(int n, int row, int[][] board) {

        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++){
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }

        //Consider the row and try placing queen in each column of the row
        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 1;    //Place the queen
                placeNQueens(n, row + 1, board);  // Recur the rest rows
                board[row][j] = 0;    //Backtrack
            }
        }
    }

    static boolean isSafe(int[][] board, int row, int col) {

        int n = board.length;

        int i, j;

        /* Check this column on top side */
        for (i = row-1, j = col-1; i >= 0 && j>=0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        /* Check this column on bottom side */
        for (i = row+1, j = col+1; i < n && j < n; i++, j++) {
            if (board[i][j] == 1)
                return false;
        }

        /* Check upper diagonal on left side */
        for (i = row-1, j = col+1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        /* Check lower diagonal on left side */
        for (i = row+1, j = col-1; i < n && j >=0; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }

        for ( i = row-1; i >=0; i--) {
            if (board[i][col] == 1)
                return false;
        }

        for ( i = row+1; i < n; i++) {
            if (board[i][col] == 1)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        placeNQueens(4);

    }
}
