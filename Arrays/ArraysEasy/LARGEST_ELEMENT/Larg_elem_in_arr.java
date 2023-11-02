package ArraysEasy.LARGEST_ELEMENT;
public class Larg_elem_in_arr{
    public static void main(String[] args) {
        int arr[]={1,56,0,-90,35,24,677};
        int min=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
