package ArraysEasy.Sec_larg_elem;

public class optimal {
    public static void main(String[] args) {
        int arr[]={2,4,5,67,66,443,444};
        int large=arr[0];
        int slarge=-1;
        for (int i=1;i<=arr.length-1;i++){
            if (arr[i]>large){
                slarge=large;
                large=arr[i];
            }
            else if(arr[i]<large && arr[i]>slarge){
                slarge=arr[i];
            }
        }
        System.out.println("Sec_larg_is "+slarge);
    }                                           //TC=O(N)
    
}
