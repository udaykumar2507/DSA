package ArraysEasy.Long_Sub_array_with_k;

public class brute {
    public static void main(String[] args) {
        int arr[]={1,1,2,1,2,0,1,1,1,2,3};
        int n=arr.length;
        int k=3;
        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            for (int j = i; j < n; j++) { // ending index
                // add all the elements of
                // subarray = a[i...j]:
                long s = 0;
                for (int K = i; K <= j; K++) {
                    s += arr[K];
                }

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }                                           //Time complexity nearly O(n^3)
        System.out.println(len);
    }
    
}
