package Binary_Search.Easy.Binary_Search;

public class Iterative {
    public static void main(String[] args) {
    int arr[]={1,3,4,5,6,67,999,6776};
    int target=55;
    int s=0;
    int e=arr.length-1;
    while(s<=e){
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            System.out.println(mid);
            break;
        }
        else if (arr[mid]>target){
            e=mid-1;
        }
        else{
            s=mid+1;
        }
       
       
    }
    

    
}
}
