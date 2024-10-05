import java.util.*;

public class Nqueens {
    // Check if placing the queen is safe
    public static boolean isSafe(char board[][], int row, int col) {
        // Check vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // Solve N-Queens problem recursively
    public static void nQueens(char board[][], int row) {
        // If all queens are placed, print the board
        if (row == board.length) {
            printboard(board);
            System.out.println(); // Add a new line for separating different solutions
            return;
        }

        // Try placing the queen in all columns
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // Place the queen
                nQueens(board, row + 1); // Recursively place the next queen
                board[row][j] = '.'; // Backtrack and remove the queen
            }
        }
    }

    // Print the board
    public static void printboard(char board[][]) {
        System.out.println("____________");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        int n = 5; // Size of the board
        char board[][] = new char[n][n]; // Create the board

        // Initialize the board with '.'
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }

        nQueens(board, 0); // Start solving from the first row
    }
}
