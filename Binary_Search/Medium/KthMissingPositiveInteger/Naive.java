package Binary_Search.Medium.KthMissingPositiveInteger;

public class Naive {
    public static void main(String[] args) {
        int arr[]={4,7,9,10};
        int k=5;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<=k)k++;
            else{
                break;
            }
            System.out.println(k);

        }
    }
    
}
