package Binary_Search.Easy.UpperandLowerBound;

public class UpperBound {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,8,9};
        int target=1;//if 6 is found  does not return the  ind of 6 it returns  smallest ind which is greater than 6
        int start=0;
        int end=arr.length-1;
        int ans=arr.length;//if target is greter than the last element(max element)then the ans will be the last index+1 
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]>target){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println(ans);

    }
    
}

    

