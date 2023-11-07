package Binary_Search.Medium.KOKOEATING_BANANA;

public class optimal {
    public static void main(String[] args) {
        int arr[]={3,7,6,11};
        int hour=8;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        int start=1;
        int end=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            int count=bananacount(arr, mid);
            if (count<=hour){
               end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println(start);

    }public static int bananacount(int arr[],int i){
        int count=0;

    for (int j=0;j<arr.length;j++){
            count+=Math.ceil(((double)arr[j])/((double)i));
        }        
        return count;
    } 
    
}
