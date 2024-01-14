import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        int arr[]={1,2,1};
        int k=2;
        int n=arr.length;
        sub(0,list,arr,n,k);
    }
    private static void sub(int ind,ArrayList<Integer>list,int arr[],int n,int k){
        if (ind>=n){
            int sum=0;
            for (int i=0;i<list.size();i++){
                sum+=list.get(i);
            }
            if (sum==k){
                System.out.print(list);
            }
        }else{
            list.add(arr[ind]);
            sub(ind+1,list,arr,n,k);
            list.remove(list.size()-1);
            sub(ind+1,list,arr,n,k);
            
        }
        
    }
}
