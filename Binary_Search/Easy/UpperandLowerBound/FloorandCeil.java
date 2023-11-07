package Binary_Search.Easy.UpperandLowerBound;

public class FloorandCeil {
    public static void main(String[] args) {
        //Floor Refers to the smallest element from the target {1,2,4,5,6} for (target =3 the floor is 2)(target=4 floor=4)
        //Ceil Refers to the Largest element from the target {1,2,4,5,6} for (target =3 the Ceil is 4)(Target=4 Ceil=4);
       //CEIL 
        int arr[]={1,2,4,5,6};
        int target=3;//if 3 is found return ind of 3 else found smallest ind which is greater than 6
        int start=0;
        int end=arr.length-1;
        int ans=arr.length;//if target is greter than the last element(max element)then the ans will be the last index+1 
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]>=target){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println("the Ceil is "+arr[ans]);
            //FLOOR    
            int arr1[]={1,2,4,5,6};
            int target1=3;//if 3 is found return ind of 3 else found smallest ind which is greater than 6
            int start1=0;
            int end1=arr1.length-1;
            int ans1=arr1.length;//if target is greter than the last element(max element)then the ans will be the last index+1 
            while(start1<=end1){
                int mid1=start1+(end1-start1)/2;
                if (arr[mid1]<=target1){
                    ans1=mid1;
                    start1=mid1+1;
                }else{
                    end1=mid1-1;
                }
            }
            System.out.println("The Floor is "+arr1[ans1]);
    
        }
        
    }
    



