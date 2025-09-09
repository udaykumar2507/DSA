class Solution {
    static int MOD = 1000000007;
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int memo[] = new int [n+1];
        Arrays.fill(memo,-1);
        int result = 0;
        for (int day = n-forget+1 ; day <= n; day++ ){
            if (day > 0){
                result += (solve(memo,day,delay,forget)%MOD);
            }
        }
        return result;
    }
    private static int solve(int [] memo , int day ,int delay,int forgot){
        if (day == 1){
            return 1;
        }
        if (memo[day] != -1){
            return memo[day];
        }
        int result = 0;
        for (int d = day-forgot+1 ; d <= day-delay ; d++){
            if (d>0){
                result +=(solve(memo,d,delay,forgot)%MOD);
            }
        }
        return memo[day] = result;
    }
}
