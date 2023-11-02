package ArraysEasy.Sec_larg_elem;

public class Better {
    public static void main(String[] args) {
        int[] arr={1,7,7,7,7,7,7};
        int larg=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>larg){
                larg=arr[i];
            }
        }
        int small=-1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=larg && arr[i]>small){
                small=arr[i];
            }
        }
        System.out.println("Sec Largest Element is "+small);//TC=O(2N)
        
    }
    
}
