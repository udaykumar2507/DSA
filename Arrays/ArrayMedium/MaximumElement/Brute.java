package MaximumElement;

public class Brute {
    public static void main(String[] args) {
        int []arr={1,4,2,3,4,4,4,4,3,2,1,4};
        int val=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for (int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>(arr.length)/2){
                 val=arr[i];
            }
        }
        if (val==0){
            System.out.println(-1);
        }else{
            System.out.println(val);
        }
    }
    
}
