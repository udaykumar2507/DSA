package Binary_Search.Medium.find_a_Smallest_divisor_given_a_threshod;

public class Optimal {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int val=8;
        int start=1;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        int end=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            int sum=sum(arr,mid);
           
            if (sum<=val){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println(start);
    }
    public static int sum(int []arr,int mid){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/(double)mid);
        }
        return sum;
    }
}
