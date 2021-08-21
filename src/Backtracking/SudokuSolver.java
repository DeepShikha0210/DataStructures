package Backtracking;

import java.util.HashSet;

public class SudokuSolver {
    public static boolean sudokuSolver(int[][] board){

        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {

                // If current row or current column or
                // current 3x3 box is not valid, return
                // false
                if (!isValid(board, i, j))
                    return false;
            }
        }
        return true;
    }

    // Checks whether current row and current column and
// current 3x3 box is valid or not
    public static boolean isValid(int[][] board, int row, int col)
    {
        return notInRow(board, row) && notInCol(board, col) &&
                notInBox(board, row - row % 3, col - col % 3);
    }

    // Checks whether there is any duplicate
// in current row or not
    public static boolean notInRow(int[][] board, int row) {

        // Set to store characters seen so far.
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < 9; i++)
        {
            // If already encountered before,
            // return false
            if (set.contains(board[row][i]))
                return false;

            // If it is not an empty cell, insert value
            // at the current cell in the set
            if (board[row][i] != 0)
                set.add(board[row][i]);
        }
        return true;
    }

    // Checks whether there is any duplicate
// in current column or not.
    public static boolean notInCol(int[][] board, int col)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < 9; i++)
        {
            // If already encountered before,
            // return false
            if (set.contains(board[i][col]))
                return false;

            // If it is not an empty cell,
            // insert value at the current
            // cell in the set
            if (board[i][col] != 0)
                set.add(board[i][col]);
        }
        return true;
    }

    // Checks whether there is any duplicate
// in current 3x3 box or not.
    public static boolean notInBox(int[][] board, int startRow, int startCol)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int row = 0; row < 3; row++) {
            for(int col = 0; col < 3; col++) {
                int curr = board[row + startRow][col + startCol];

                // If already encountered before, return
                // false
                if (set.contains(curr))
                    return false;

                // If it is not an empty cell,
                // insert value at current cell in set
                if (curr != 0)
                    set.add(curr);
            }
        }
        return true;
    }
}
