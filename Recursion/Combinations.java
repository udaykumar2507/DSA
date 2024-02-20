class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>twodlist=new ArrayList<>();
        int n=candidates.length;
        comb(twodlist,candidates,0,target,new ArrayList<>(),n);
        return twodlist;
    }
    public static void comb(List<List<Integer>>twodlist,int []candidates,int ind,int target,List<Integer>list,int n){
        if (ind==n){
            if (target==0){
                twodlist.add(new ArrayList<>(list));
                return;
            }
        }else{
            if (candidates[ind]<=target){
                list.add(candidates[ind]);
                comb(twodlist,candidates,ind,target-candidates[ind],list,n);
                list.remove(list.size()-1);
            }
            comb(twodlist,candidates,ind+1,target,list,n);
        }
    }
}
