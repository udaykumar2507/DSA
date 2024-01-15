import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int k=4;
        int n=arr.length;
        int ans=sub(0,arr,n,0,k);
        System.out.print(ans);
    }
    private static int  sub(int ind,int arr[],int n,int sum,int k) {
        if (ind >=n){
            if (sum==k){
                return 1;
            }else{
                return 0;
            }
        }else{
            sum+=arr[ind];
            int l= sub(ind+1,arr,n,sum,k);
            sum-=arr[ind];
            int r= sub(ind+1,arr,n,sum,k);
            return l+r;
        }
    
    }
}
