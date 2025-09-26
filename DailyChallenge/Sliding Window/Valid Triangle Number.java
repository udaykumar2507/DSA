class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        for (int k = n-1 ; k > 1 ; k-- ){
            int j =  k-1;
            int i = 0;
            while (i < j ){
                if (nums[i] + nums[j] > nums[k]){
                    res += (j - i);
                    j--;
                }else{
                    i++;
                }
            }
        }
        return res;
    }
}
