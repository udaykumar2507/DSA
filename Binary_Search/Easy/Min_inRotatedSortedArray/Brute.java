package Binary_Search.Easy.Min_inRotatedSortedArray;

public class Brute {
    public static void main(String[] args) {
        int arr[]={6,7,8,9,1,2,3,4,5};
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
    
}
