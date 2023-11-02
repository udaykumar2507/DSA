package ArraysEasy.Num_that_appear_ones_inarray;

public class brute {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,5,4,3,4};
        for(int i=0;i<arr.length;i++){
            int count=0;
            for (int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
               
            }
             if (count==1){
                    System.out.println(arr[i]);
                }
                                            //Time Complexity O(n^2)
        }
    }
    
}
