package Binary_Search.Medium.SquarerootofNum;

public class Naive {
    public static void main(String[] args) {
        int n=80;
        int ans=0;
        for(int i=0;i<n;i++){
            if (i*i<=n){
                ans=i;
            }else{
                break;
            }
        }
        System.out.println(ans);
    }
    
}
