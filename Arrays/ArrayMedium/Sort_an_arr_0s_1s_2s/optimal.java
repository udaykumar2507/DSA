package Sort_an_arr_0s_1s_2s;

public class optimal {
    public static void main(String[] args) {
        int arr[]={2,1,0,2,1,0,1,2,1,1};
        int low=0;int mid=0;int high=arr.length-1;
        while(mid<=high){
            if (arr[mid]==0){
                swap(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,high,mid);
                    high--;
                
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        
    }
    
}

