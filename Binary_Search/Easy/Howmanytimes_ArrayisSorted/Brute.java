package Binary_Search.Easy.Howmanytimes_ArrayisSorted;

public class Brute {
    public static void main(String[] args) {
        int arr[]={4,5,6,1,2,3};//at which index the minimum is present that is the Rotate Index
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        System.out.println(index);

    }
    
}
