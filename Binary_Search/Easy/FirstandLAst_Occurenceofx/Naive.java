package Binary_Search.Easy.FirstandLAst_Occurenceofx;

public class Naive {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,8,8,11,13};
        int x=8;
        int first=-1;
        int last=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x && first==-1){
                first=i;
            }else if (arr[i]==x && first!=-1){
                last=i;
            }
        }
        System.out.println(first+"    "+last);
    }
    
}
