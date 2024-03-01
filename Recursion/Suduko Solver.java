class Solution {
    public void solveSudoku(char[][] board) {
            solve(board);
    }
    static boolean solve(char[][] boards){
        for(int i=0;i<boards.length;i++){
            for (int j=0;j<boards[0].length;j++){
                if (boards[i][j]=='.'){
                    for (char c='1';c<='9';c++){
                        if (isvalid(i,j,boards,c)){
                            boards[i][j]=c;
                            if (solve(boards)==true){
                                return true;
                            }else{
                                boards[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isvalid(int row,int col,char[][] boards,char c){
        for (int i=0;i<9;i++){
            if (boards[row][i]==c){
                return false;
            }
            if(boards[i][col]==c){
                return false;
            }
            if (boards[3*(row/3)+i/3][3*(col/3)+i%3]==c){
                return false;
            }
        }
        return true;
    } 
}
