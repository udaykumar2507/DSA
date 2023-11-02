package ArraysHard.Longest_subarrwith_sum0;
import java.util.*;
public class Optimal {
    public static void main(String[] args) {
        int arr[]={1,-1,3,2,-2,-8,1,7,10,23};
        Map<Integer,Integer>mpp=new HashMap<>();
        int sum=0;
        int maxi=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            if (sum==0){
                maxi=i+1;
            }
            else{
                if (mpp.get(sum)!=null){
                    maxi=Math.max(maxi,i-mpp.get(sum));
                }
                else{
                    mpp.put(sum,i);
                }
            }
        }
        System.out.println(maxi);
    }
    
}
