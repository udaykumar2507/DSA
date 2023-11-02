package Sort_an_arr_0s_1s_2s;
import java.util.ArrayList;
public class brute{
    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2,0,1,2};
        int start=0;
        int end=arr.length-1;
        MergeSort(arr, start, end);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void MergeSort(int arr[],int start,int end){
        if (start>=end){
            return;
        }
        int mid=(start+end)/2;
        MergeSort(arr,start,mid);
        MergeSort(arr, mid+1, end);
        merge(arr,start,mid,end);
    }
    public static void merge(int arr[],int start,int mid,int end){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=start;
        int right=mid+1;
        while(left<=mid && right<=end){
            if (arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }

        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=end){
            temp.add(arr[right]);
            right++;
        }
        for (int i=start;i<=end;i++){
            arr[i]=temp.get(i-start);//Time complexity o(nlogn)
        }

    }
}
    

