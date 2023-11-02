
package ArraysEasy.Sec_larg_elem;
import java .util.Arrays;
public class Bruteforce {
    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,2,2,2};
        Arrays.sort(arr);
        int n=arr.length;
        int sec_larg=0;
        int last_ele=arr[n-1];
        for(int i=arr.length-2;i>=0;i--){
            if (last_ele!=arr[i]){
                sec_larg=arr[i];
                break;
            }
        }
        System.out.println("Second Largest "+sec_larg);//TC=O(logn*n)

        
    }
    
}
