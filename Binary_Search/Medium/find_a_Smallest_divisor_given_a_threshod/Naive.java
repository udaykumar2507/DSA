package Binary_Search.Medium.find_a_Smallest_divisor_given_a_threshod;

public class Naive {
    public static void main(String[] args) {
        int arr[]={8,4,2,3};int val=10;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        for (int i=1;i<=max;i++){
            int sum=0;
            for (int j=0;j<arr.length;j++){
                sum+=Math.ceil((double)arr[j]/(double)i);
            }
            if (sum<=val){
                System.out.println(i);
                break;
            }

        }
    }
    
}
