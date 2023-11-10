package Binary_Search.Medium.Capacity_to_Ship_PackagesWithDdays;

public class Optimal {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i =0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(arr[i],max);
        }
        int start=max;
        int end=sum;
        while(start<=end){
            int mid=start+(end-start)/2;
            int dayscount=func(arr,mid);
            if (dayscount<=days){
                end=mid-1;
            }else if (dayscount>days){
                start=mid+1;
            }
        }
        System.out.println(start);

    }
    public static int func(int arr[],int i){
        int days=1;
        int load=0;
        for(int j=0;j<arr.length;j++){
            if (load+arr[j]<=i){
                load+=arr[j];
            }else{
                days++;
                load=arr[j];
            }
        }
        return days;
    }
    
}
