class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>>combinations=new ArrayList<>();
         Arrays.sort(candidates);
         comb(0,candidates,combinations,target,new ArrayList<>());
         return combinations;

        }
        private static void comb(int ind,int []arr, List<List<Integer>>twodlist,int target,List<Integer>list){
            if (target==0){
                twodlist.add(new ArrayList<>(list));
                return;
            }
            for (int i=ind;i<arr.length;i++){
                if (i>ind && arr[i-1]==arr[i])continue;
                if (arr[i]>target)break;
                list.add(arr[i]);
                comb(i+1,arr,twodlist,target-arr[i],list);
                list.remove(list.size()-1);
            }

        }
    }
