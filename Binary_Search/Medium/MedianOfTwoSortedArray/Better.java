package Binary_Search.Medium.MedianOfTwoSortedArray;

public class Better {
    public static void main(String[] args) {
        int arr1[]={1,3,4,7,10,12};
        int arr2[]={2,3,6,5};
        int n1=arr1.length;
        int n2=arr2.length;
        int n=n1+n2;
        int i=0;
        int j=0;
        int count=0;
        int ind1=n/2-1;
        int ind2=n/2;
        int ind_el1=Integer.MIN_VALUE;
        int ind_el2=Integer.MAX_VALUE;
        while(i<n1 && j<n2){
            if (arr1[i]<arr2[j]){
            if(count==ind1){
                ind_el1=arr1[i];
            }if (count==ind2){
                ind_el2=arr1[i];
                break;
            }
            count++;i++;
        }else{
            if (count==ind1){
                ind_el1=arr2[j];
            }if (count==ind2){
                ind_el2=arr2[j];
                break;
            }
            count++;
            j++;
        }
        }
       if(n%2==0){
        System.out.println((ind_el1+ind_el2)/2);
       }else{
        System.out.println(n/2);
       }
    }
    
}
