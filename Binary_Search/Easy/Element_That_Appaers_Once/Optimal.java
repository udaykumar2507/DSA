package Binary_Search.Easy.Element_That_Appaers_Once;

public class Optimal {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,4,4,5,5,7,7};
        int start=1;
        int end=arr.length-2;
        int n=arr.length-1;
        if (arr[0]!=arr[1]){
            System.out.print(arr[0]);
        }
        else if (arr[n]!=arr[n-1]){
            System.out.print(arr[n]);
        }
        else{
            while(start<=end){
                int mid=start+(end-start)/2;
                if (arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                    System.out.print(arr[mid]);break;
                }else if (mid%2==0){
                    if (arr[mid-1]==arr[mid]){
                        end=mid-1;
                    }else if (arr[mid]==arr[mid+1]){
                        start=mid+1;
                    }
                }else{
                    if (arr[mid]==arr[mid-1]){
                        start=mid+1;
                    }else if (arr[mid]==arr[mid+1]){
                        end=mid-1;
                    }
                }

            }
        }
        

    }
    
}
