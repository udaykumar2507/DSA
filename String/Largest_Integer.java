class Solution {
    public String largestOddNumber(String nums) {
        int i=nums.length()-1;
        while(i>=0){
            int num=Character.getNumericValue(nums.charAt(i));
            if (num%2==1){
                break;
            }else{
                i--;
            }
        }
        if (i==-1){
            return "";
        }
            return nums.substring(0,i+1); 
       

        
    }
}
