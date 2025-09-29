class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int [][] memo = new int [101][101];
        for (int [] mat : memo) Arrays.fill(mat,-1);
        return solve(values,memo,0,n-1);
    }
    private static int solve(int [] values,int [][] memo, int i ,int j){
        if ( memo[i][j] != -1 ){
            return memo[i][j];
        }
        int result = Integer.MAX_VALUE;
        if ( j-i+1 < 3){
            return memo[i][j] = 0;
        }
        for ( int k = i+1; k < j; k++){
            int wt = solve(values,memo,i,k) + (values[i] * values[j] * values[k]) + solve(values,memo,k,j);
            result = Math.min(result,wt);
        }
        return memo[i][j] = result;
    }
}
