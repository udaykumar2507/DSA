package ArraysHard.Longest_subarrwith_sum0;

public class Brute {
    public static void main(String[] args) {
        int arr[]={1,-1,3,2,-2,-8,1,7,10,23};
        int maxi=0;
        for (int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum+=arr[j];
                if (sum==0){
                    maxi=Math.max(maxi,j-i+1);
                }

            }
        }
        System.out.println(maxi);
    }
    
}
