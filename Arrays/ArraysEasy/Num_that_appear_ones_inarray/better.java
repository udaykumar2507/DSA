package ArraysEasy.Num_that_appear_ones_inarray;

public class better {
    //Hashing method
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4,5,5,6,6};
        int max=arr[0];
        //Finding max element
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        int[] arr1 = new int[max+1];
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]++;
        }
        
       for (int i=1;i<max+1;i++){           //It takes O(3N)
        if (arr1[i]==1){
            System.out.println(i);
        }
       }
        
        
    }
    
}
