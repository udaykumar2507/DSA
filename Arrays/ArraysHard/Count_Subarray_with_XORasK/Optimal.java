package ArraysHard.Count_Subarray_with_XORasK;
import java.util.*;
public class Optimal {
    public static void main(String[] args) {
        int arr[]={4,2,2,6,4};
        int k=6;
        
        // formula for this approach is xr^k=x;
        Map<Integer,Integer>mpp=new HashMap<>();
        int xr=0;
        mpp.put(xr,1);
        int cnt=0;
        for (int i=0;i<arr.length;i++){
            xr^=arr[i];
            int x=xr^k;
            if (mpp.containsKey(x)){
                cnt+=mpp.get(x);
            }
            if (mpp.containsKey(xr)){
                mpp.put(xr,mpp.get(xr)+1);
            }
            else{
                mpp.put(xr,1);
            }
        }
        System.out.println(cnt);
    }
    
}
