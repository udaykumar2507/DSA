package Binary_Search.Easy.Howmanytimes_ArrayisSorted;

public class Optimal {
    public static void main(String[] args) {
        int arr[]={4,5,6,1,2,3};
        int start=0;
        int end=arr.length-1;
        int min=Integer.MAX_VALUE;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[start]<=arr[end]){
                min=arr[start];
                index=start;
                break;
            }
            if (arr[start]<=arr[mid]){
                min=Math.min(min,arr[start]);
                index=start;
                start=mid+1;
            }
            else{
                min=Math.min(min,arr[mid]);
                index=mid;
                end=mid-1;
            }
        }
        System.out.println(index);
    }
    
}
