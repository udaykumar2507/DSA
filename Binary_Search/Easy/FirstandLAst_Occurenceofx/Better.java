package Binary_Search.Easy.FirstandLAst_Occurenceofx;

public class Better {
    public static void main(String[] args) {
        int arr[]={2,8,8,8,8,8,11,13};
        int target=8;
        int start=0;
        int end=arr.length-1;
        int first=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]>=target){
                first=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        int start1=0;
        int end1=arr.length-1;
        int last=arr.length;
        while(start1<=end1){
            int mid1=start1+(end1-start1)/2;
            if (arr[mid1]>target){
                last=mid1;
                end1=mid1-1;
            }else{
                start1=mid1+1;
            }
           
        } if (first==arr.length || arr[first]!=target){
                first=-1;
                last=0;
            }
       
System.out.println("The target "+target+" is firstly occured in index "+first+"  and lastly occured in index "+(last-1)+"");


    }
    
}
