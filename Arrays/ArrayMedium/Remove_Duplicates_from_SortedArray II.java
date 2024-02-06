class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0;
        for (int j=0;j<arr.length;j++){
            if (i==0 || i==1|| arr[j]!=arr[i-2] ){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }
}
