package MaximumElement;
import java.util.HashMap;

public class better {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,1,2,2,1,2,3,3,3};
        HashMap<Integer,Integer>hash=new HashMap<>(0, 0);
        for (int i=0;i<arr.length;i++){
            hash.put(arr[i],i);
        }
    }
    
}
