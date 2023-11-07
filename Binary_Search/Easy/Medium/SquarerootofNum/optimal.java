package Binary_Search.Medium.SquarerootofNum;

public class optimal {
    public static void main(String[] args) {
        int n=80;
        int ans=0;
        int start=1;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (mid*mid<=n){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            };
        }
        System.out.println(ans);//we dont need the answer because the (end) is always at the last index of non eliminating area 
    }
    
}
