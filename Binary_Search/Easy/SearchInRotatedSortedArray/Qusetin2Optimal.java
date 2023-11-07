package Binary_Search.Easy.SearchInRotatedSortedArray;

public class Qusetin2Optimal {
    class Solution {
        public boolean search(int[] arr, int target) {
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if (arr[mid]==target){
                   return true;
                }
                if (arr[start]==arr[mid] && arr[end]==arr[mid]){
                    start++;
                    end--;
                    continue;
                }
                else if (arr[mid]>=arr[start]){
                    if (arr[mid]>=target && arr[start]<=target){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
                else{
                    if (arr[mid]<=target && arr[end]>=target){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }
            }
            return false;
            
        }
    }
    
}
