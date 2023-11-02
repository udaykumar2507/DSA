package ArraysEasy.Num_that_appear_ones_inarray;

public class optimal {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,4,4,3,3,5};
        int x=0;
        for (int i=0;i<arr.length;i++){
            x=x^arr[i];
        }
        System.out.println(x);
    }
    
}
