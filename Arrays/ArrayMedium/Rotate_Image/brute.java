package Rotate_Image;

public class brute {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        for(int i=0;i<arr.length;i++){
            for (int j=arr.length-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();                    //Time complexity=O(N^2)
                                                     //Space complexity=we have to create a extra 2d array to return
        }
    }
    
}
