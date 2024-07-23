class Solution {
    public int[] frequencySort(int[] nums) {
        Integer [] ans=new Integer[nums.length];
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        Arrays.sort(ans,(a,b)->{
            if (map.get(a)==map.get(b)){
                return Integer.compare(b,a);
            }else{
                return Integer.compare(map.get(a),map.get(b));
            }
        });
        for (int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
       return nums;
    }
}
