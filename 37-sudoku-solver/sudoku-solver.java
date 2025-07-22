class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                // Try to place a number if the cell is empty
                if (board[row][col] == '.') {
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (isValid(board, row, col, ch)) {
                            board[row][col] = ch;
                            if (solve(board)) {
                                return true; // If solution found, return
                            } else {
                                board[row][col] = '.'; // Backtrack
                            }
                        }
                    }
                    return false; // If no valid number found, trigger backtrack
                }
            }
        }
        return true; // All cells are filled
    }

    private boolean isValid(char[][] board, int row, int col, char ch) {
        // Check row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch || board[i][col] == ch) return false;
        }

        // Check 3x3 box
        int boxRowStart = 3 * (row / 3);
        int boxColStart = 3 * (col / 3);
        for (int i = boxRowStart; i < boxRowStart + 3; i++) {
            for (int j = boxColStart; j < boxColStart + 3; j++) {
                if (board[i][j] == ch) return false;
            }
        }

        return true;
    }
}
