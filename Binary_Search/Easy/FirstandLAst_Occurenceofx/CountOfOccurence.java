package Binary_Search.Easy.FirstandLAst_Occurenceofx;

public class CountOfOccurence {
    public static void main(String[] args) {
    int arr[]={1,3,4,5,6,67,67,999,999,999,999};
    int target=999;
    int s=0;
    int e=arr.length-1;
    int first=-1;
    while(s<=e){
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            first=mid;
            e=mid-1;
        }
        else if (arr[mid]>target){
            e=mid-1;
        }
        else{
            s=mid+1;
        }
    }
     int s1=0;
    int e1=arr.length-1;
    int last=-1;
    while(s1<=e1){
        int mid1=s1+(e1-s1)/2;
        if(arr[mid1]==target){
            last=mid1;
            s1=mid1+1;
        }
        else if (arr[mid1]>target){
            e1=mid1-1;
        }
        else{
            s1=mid1+1;
        }
    }
    System.out.print("The number of occurence of the "+target+" is "+(last-first+1));
    
}
}