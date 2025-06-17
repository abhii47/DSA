class Solution {
     public static boolean allowed(char[][] board,char ch,int row,int col){
        //row 
        for(int i=0;i<9;i++){
            if(i==col)continue;
            if(board[row][i]==ch)return false;
        }

        //col
        for(int i=0;i<9;i++){
            if(i==row)continue;
            if(board[i][col]==ch)return false;
        }

        int minRow = (row/3)*3;
        int minCol = (col/3)*3;
        //submatrix
        for(int i=minRow; i<minRow+3;i++){
            for(int j=minCol;j<minCol+3;j++){
                if(i==row && j==col) continue;
                if(board[i][j]==ch)return false;
            }
        }return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(!allowed(board,board[i][j],i,j)) return false;
            }
        }return true;
    }
}