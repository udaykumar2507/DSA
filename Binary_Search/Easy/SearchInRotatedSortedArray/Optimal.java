package Binary_Search.Easy.SearchInRotatedSortedArray;

public class Optimal {
    public static void main(String[] args) {
        int arr[]={7,8,9,1,2,3,4,5,6};
        int target=15;
        int start=0;
        int end=arr.length-1;
        int flag=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                System.out.println("Element Found at Index "+mid);
                flag=1;
                break;
            }
            else if (arr[mid]>=arr[start]){
                if (arr[mid]>=target && arr[start]<=target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else{
                if (arr[mid]<=target && arr[end]>=target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        if (flag==0){
            System.out.println("Element not found");
        }
    }
    
}
