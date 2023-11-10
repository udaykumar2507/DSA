package Binary_Search.Medium.AggresiveCows;
import java.util.*;
public class Naive {
    public static void main(String[] args) {
        int arr[]={4,2,1,3,6};
        Arrays.sort(arr);
        int k=2;
        int i=1;
        while(i>0){
            if (canwereplace(arr, i, k)){
                i++;
            }else{
                break;
            }
        }
        System.out.println(i-1);
    }
    public static boolean canwereplace(int[] arr,int i,int k){
        int last=arr[0];int cowscount=1;
        for (int j=1;j<arr.length;j++){
            if ((arr[j]-last)>=i){
                cowscount++;
                last=arr[j];
                if (cowscount==k){
                    return true;
                }
            }
        }
        return false;
    }
    
}
