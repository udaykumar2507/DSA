package ArraysHard.Count_Subarray_with_XORasK;

public class Brute {
    public static void main(String[] args) {
        int arr[]={4,2,2,6,4};
        int k=6;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            int xr=0;
            for(int j=i;j<arr.length;j++){
                xr^=arr[j];
                if (xr==k){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    
}
