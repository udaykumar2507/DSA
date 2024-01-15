import java.util.*;
class Subsequence {
    public static void main(String[] args) {
       int arr[]={3,2,1};
       int n=arr.length;
       ArrayList<Integer>list=new ArrayList<>();
       subsequence(0,list,arr,n);
    }
    private static void subsequence(int ind,ArrayList<Integer>list,int []arr,int n){
        if (ind>=n){
            System.out.println(list);
        }else{
            list.add(arr[ind]);
            subsequence(ind+1,list,arr,n);
            list.remove(list.size()-1);
            subsequence(ind+1,list,arr,n);
        }
    }
}
