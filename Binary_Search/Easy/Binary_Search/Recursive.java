package Binary_Search.Easy.Binary_Search;

public class Recursive {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,89,999,1000};
        int start=0;
        int end=arr.length-1;
        int target=89;
        int ans=bs(arr,start,end,target);
        System.out.println(ans);
        
    }
    public static int bs(int [] arr,int start,int end,int target){
        if (start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            return bs(arr,mid+1,end,target);
        }else{
            return bs(arr,start,mid-1,target);
        }
    }
    
}
