import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        ArrayList<Integer>list=new ArrayList<>();
        int k=2;
        int n=arr.length;
        boolean ans=sub(0,arr,list,n,0,k);
    }
    private static boolean sub(int ind,int arr[],ArrayList<Integer> list,int n,int sum,int k) {
        if (ind >=n){
            if (sum==k){
                System.out.print(list);
                return true;
            }else{
                return false;
            }
        }else{
            list.add(arr[ind]);
            sum+=arr[ind];
            if(sub(ind+1,arr,list,n,sum,k)==true){
                return true;
            }
            sum-=arr[ind];
            list.remove(list.size()-1);
            if (sub(ind+1,arr,list,n,sum,k)==true){
                return true;
            }
        }
        return false;
    }
}
