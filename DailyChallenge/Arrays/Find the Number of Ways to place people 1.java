
class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(b[1], a[1]); 
            }
        });
        int ans = 0;
        for (int i = 0;i <  n; i++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            int k = Integer.MIN_VALUE;
            for (int j = i+1; j < n; j++){
                int x2 = points[j][0];
                int y2 = points[j][1];
                if (y2 > y1){
                    continue;
                }
                if (y2 > k) {
                    ans++;
                }
                if (y2 > k ){
                    k = y2;
                }
            }
        }
        return ans;

    }
}
