class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        boolean []freq=new boolean[nums.length];
        permutation(nums,new ArrayList<>(),ans,freq);
        return ans; 
        
    }
    private static void permutation(int []arr,List<Integer>list,List<List<Integer>>twodlist,boolean[] freq){
        if (list.size()==arr.length){
            twodlist.add(new ArrayList<>(list));
            return;
        }else{
            for(int i=0;i<arr.length;i++){
                if(freq[i]==false){
                    freq[i]=true;
                    list.add(arr[i]);
                    permutation(arr,list,twodlist,freq);
                    freq[i]=false;
                    list.remove(list.size()-1);                }

            }
        }
    }
}
