package Binary_Search.Medium.MedianOfTwoSortedArray;
import java.util.*;

public class Naive {
    public static void main(String[] args) {
        int arr1[]={1,3,4,7,10,12};
        int arr2[]={2,3,6,5};
        ArrayList<Integer>list=new ArrayList<>();
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if (arr1[i]<arr2[j]){
                list.add(arr1[i]);
                i++;
            }else{
                list.add(arr2[j]);
                j++;
            }
        }
        while(i<n1){
            list.add(arr1[i]);
            i++;
        }while(j<n2){
            list.add(arr2[j]);
            j++;
        }
        int n=n1+n2;
        if (n%2==0){
            System.out.println((list.get(n/2)+list.get(n/2-1))/2);
        }else{
            System.out.println(list.get(n/2));
        }
        
    }
    
}
