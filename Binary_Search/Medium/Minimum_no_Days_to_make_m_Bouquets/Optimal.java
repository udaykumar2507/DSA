package Binary_Search.Medium.Minimum_no_Days_to_make_m_Bouquets;

public class Optimal {
    public static void main(String[] args) {
        int arr[]={7,7,7,7,13,11,12,7};
        int m=2;//no of adjacent pair
        int k=3;//adjacent pair size
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        
       while(min<=max){
        int mid=min+(max-min)/2;
        if (func(arr,mid,m,k)){
            max=mid-1;
        }else{
            min=mid+1;
        }
       }
       System.out.println(min);
    }
    public static boolean func(int arr[],int i,int m,int k){
      
            int count=0;
            int bouquets=0;
            for(int j=0;j<arr.length;j++){
                if (arr[j]<=i){
                    count++;
                }else{
                    bouquets+=(count/k);
                    count=0;
                }
            }
            bouquets+=(count/k);
            if (bouquets>=m){
                return true;
            }else{
                return false;
            }
    
}
}
