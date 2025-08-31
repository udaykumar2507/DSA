class Solution {
    public void solveSudoku(char[][] board) {
            solve(board);
    }
    public static boolean solve(char [][]board){
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if (board[i][j]=='.'){
                    for (char k='1';k<='9';k++){
                        if (isvalid(board,i,j,k)){
                            board[i][j]=k;
                            if (solve(board)==true){
                                return true;
                            }else{
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isvalid(char [][]boards,int row,int col,char k){

        for (int i=0;i<9;i++){
            if(boards[row][i]==k){
                return false;
            }
            if (boards[i][col]==k){
                return false;
            }
            if (boards[3*(row/3)+i/3][3*(col/3)+i%3]==k){
                return false;
            }
        }
        return true;
        
    }
        
    
}