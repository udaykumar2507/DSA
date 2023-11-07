package Binary_Search.Easy.Min_inRotatedSortedArray;

public class Optimal {
    public static void main(String[] args) {
        int arr[]={7,8,9,1,2,3,4,5,6};
        int start=0;
        int end=arr.length;
        int ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[start]<=arr[mid]){
                ans=Math.min(arr[start],ans);
                start=mid+1;
            }
            else{
                ans=Math.min(arr[mid],ans);
                end=mid-1;
            }
        }
        System.out.println(ans);
    }
    
}
