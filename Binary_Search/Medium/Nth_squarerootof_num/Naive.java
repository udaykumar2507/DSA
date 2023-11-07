package Binary_Search.Medium.Nth_squarerootof_num;

public class Naive {
    public static void main(String[] args) {
        int n=100000;
        int pow=5;
        int ans=0;
        for (int i=1;i<n;i++){
            if (Math.pow(i,pow)==n){
                ans=i;
                break;
            }
        }
        if (ans==0){
            System.out.println("Not Found");
        }else{
            System.out.println("Nth Square Root is "+ans);
        }
    }
    
}
