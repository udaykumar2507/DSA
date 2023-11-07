package Binary_Search.Medium.KOKOEATING_BANANA;

public class Naive {
    public static void main(String[] args) {
        int arr[]={3,6,7,11};
        int hour=8;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        for (int i=1;i<max;i++){
            int count=bananacount(arr,i);
            if (count<=hour){
                System.out.println(i);
                break;
            }

        }
        System.out.println(Math.ceil(7/3));
    }
    public static int bananacount(int arr[],int i){
        int count=0;
        for (int j=0;j<arr.length;j++){
            count+=Math.ceil(arr[j]/i);
        }
        return count;
    } 
    
}
