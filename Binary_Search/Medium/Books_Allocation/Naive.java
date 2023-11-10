package Binary_Search.Medium.Books_Allocation;

public class Naive {
    public static void main(String[] args) {
        int arr[]={25,46,28,49,24};
        int student=4;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            sum+=arr[i];
        }
        for (int i=max;i<sum;i++){
            int students= ispageequals(arr,i);
            if (students==student){
                System.out.println(i);
                break;
            }
        }
    }
    public static int ispageequals(int arr[],int i){
        int pagescount=0;
        int student=1;
        for (int j=0;j<arr.length;j++){
            if (arr[j]+pagescount<=i){
                pagescount+=arr[j];
            }else if (arr[j]+pagescount>i){
                student++;
                pagescount=arr[j];
            }
        }
        return student;


    }
    
}
