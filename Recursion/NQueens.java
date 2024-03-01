class Solution {
    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char [n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>>ans=new ArrayList<>();
        Nqueen(0,board,ans,n); 
        return ans;
    }
    private static void Nqueen(int col,char [][] boards,List<List<String>>ans,int n){
        if (col==n){
            ans.add(convert(boards));
            return;
        }else{
            for (int row=0;row<n;row++){
                if (IsSafe(row,col,boards,n)){
                    boards[row][col]='Q';
                    Nqueen(col+1,boards,ans,n);
                    boards[row][col]='.';
                }
            }
        }
    }
      static List < String > convert(char[][] boards) {
        List < String > res = new ArrayList <> ();
        for (int i = 0; i < boards.length; i++) {
            String s = new String(boards[i]);
            res.add(s);
        }
        return res;
    }
    private static boolean IsSafe(int row,int col,char [][]boards,int n){
        int duprow=row;
        int dupcol=col;
        while(row>=0 && col>=0){
            if (boards[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }
        row=duprow;
        col=dupcol;
        while(col>=0){
            if (boards[row][col]=='Q'){
                return false;
            }
            col--;
        }
        col=dupcol;
        while(row<n && col>=0){
            if (boards[row][col]=='Q'){
                return false;
            }
            col--;
            row++;
        }
        return true;
    }
}
