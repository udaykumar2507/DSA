class Solution {
    public boolean isValidSudoku(char[][] board) {
        return solve(board);
    }
    public boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]>='1' && board[i][j]<='9'){
                    if(!check(board,i,j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean check(char[][] board,int row,int col){
        char ch=board[row][col];
        //board[row][col]='.';
        for(int i=0;i<9;i++){
            if(board[i][col]==ch && i!=row){
                return false;
            }
            if(board[row][i]==ch && i!=col){
                return false;
            }
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==ch && 3*(row/3)+i/3!=row && 3*(col/3)+i%3!=col){
                return false;
            }
        }
        return true;
    }
}