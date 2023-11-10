package Binary_Search.Medium.Books_Allocation;

public class Optimal {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int student=2;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            sum+=arr[i];
        }
        int start=max;
        int end=sum;
        while(start<=end){
            int mid=start+(end-start)/2;
            int students=ispageequals(arr, mid);
            if (students<=student){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        System.out.println(start);  
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

    

