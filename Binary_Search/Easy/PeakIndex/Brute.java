package Binary_Search.Easy.PeakIndex;

public class Brute {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,8,4,3,2,1};
        int n=arr.length-1;
        if(arr[0]>arr[1]){
            System.out.println("The Peak is "+arr[0]);
        }
        else if (arr[n]>arr[n-1]){
            System.out.println("The peak is "+arr[n]);
        }
        else {
            for(int i=1;i<arr.length-2;i++){
                if (arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    System.out.println("This is the peak Element "+arr[i]);
                    break;
                }
            }
        }
    }
    
}
