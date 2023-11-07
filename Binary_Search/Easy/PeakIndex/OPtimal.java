package Binary_Search.Easy.PeakIndex;

public class OPtimal {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,9,8,1};
        int n=arr.length-1;
        int start=1;
        int end=arr.length-2;
        if (arr[0]>arr[1]){
            System.out.println(arr[0]);
        }else if (arr[n]>arr[n-1]){
            System.out.println(arr[n]);
        }else{
            while(start<=end){
                int mid=start+(end-start)/2;
                if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                    System.out.print(arr[mid]);
                    break;
                }else if (arr[mid]>arr[mid-1]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
    }
    
}
