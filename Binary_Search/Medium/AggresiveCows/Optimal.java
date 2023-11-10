package Binary_Search.Medium.AggresiveCows;
import java.util.*;
public class Optimal {
    public static void main(String[] args) {
      int []arr={4,2,1,3,6};
      int k=2;
      int n=arr.length;
      Arrays.sort(arr);
      int start=1;
      int end=arr[n-1];
      while(start<=end){
        int mid=start+(end-start)/2;
        if (canwereplace(arr,mid,k)){
            start=mid+1;
        }else{
            end=mid-1;
        }
      }
      System.out.println(end);
    }
    public static boolean canwereplace(int[] arr,int i,int k){
        int last=arr[0];int cowscount=1;
        for (int j=1;j<arr.length;j++){
            if ((arr[j]-last)>=i){
                cowscount++;
                last=arr[j];
                if (cowscount>=k){
                    return true;
                }
            }
        }
        return false;
    }
    
}
