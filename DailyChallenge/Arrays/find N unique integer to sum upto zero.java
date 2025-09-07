class Solution {
    public int[] sumZero(int n) {
        int [] arr = new int [n];

        if (n%2 == 0){
            int cnt = 1;
            for (int i = 0;i < n; i+=2){
                arr[i] =-cnt;
                arr[i+1] = cnt;
                cnt++;
            }
        }else{
            int mid = n/2;
            arr[mid]=0;
            int cnt = 1;
            for (int i =0; i < mid; i++){
                arr[i] = cnt;
                cnt++;
            }
            cnt--;
            for (int i =mid+1;i<n;i++){
                arr[i]=-cnt;
                cnt--;
            }
        }
        return arr;
    }
}
