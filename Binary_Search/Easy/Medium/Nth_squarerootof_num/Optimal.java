package Binary_Search.Medium.Nth_squarerootof_num;

public class Optimal {
    public static void main(String[] args) {
        int num=81;
        int pow=4;
        int start=1;
        int end=num;
        int ans1=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int n=func(mid,num,pow);
            if (n==1){
                ans1=mid;
                break;
            }else if (n==0){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            }
           System.out.println(ans1);
        }
    public static int func(int mid,int num,int pow){
        long ans=1;
        for (int i=1;i<pow;i++){
            ans*=mid;
            if (ans>num){
                return 2;
            }else if (ans==num){
                return 1;
            }
            }
            if (ans==num){
                return 1;
            }
            return 0;
     
    }
    
}
