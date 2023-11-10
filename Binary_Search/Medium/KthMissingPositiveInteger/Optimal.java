package Binary_Search.Medium.KthMissingPositiveInteger;

public class Optimal {
    public static void main(String[] args) {
        int arr[]={4,7,9,10};
        int start=0;
        int end=arr.length-1;
        int k=5;
        while(start<=end){
            int mid=(start+end)/2;
            int missing=arr[mid]-(mid+1);
            if (missing<k){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println(end+1+k); //at last end is at the 4 and start  is at 7 in between the missing num is lying
    }
    
}
