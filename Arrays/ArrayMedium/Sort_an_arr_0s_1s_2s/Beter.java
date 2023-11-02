package Sort_an_arr_0s_1s_2s;

public class Beter {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2,0,1,2};
        int count0=0;
        int count1=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
            
            
        }
        for (int i=0;i<count0;i++){ arr[i]=0;}
        for(int i=count0;i<count1+count0;i++){arr[i]=1;}
        for (int i=count0+count1;i<arr.length;i++){arr[i]=2;}
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
