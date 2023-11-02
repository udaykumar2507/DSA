package Binary_Search.Easy.Element_That_Appaers_Once;

public class Brute {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,5,5,7,7};
        int n=arr.length-1;
        if (arr[0]!=arr[1]){
            System.out.print(arr[0]);
        }
        else if (arr[n]!=arr[n-1]){
            System.out.print(arr[n]);
        }
        else{
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=arr[i+1] && arr[i]!=arr[i-1]){
                System.out.print(arr[i]);
                break;
            }
        }
    }
    }
    
}
