class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>twodlist=new ArrayList<>();
        int n=nums.length;
        sub2(0,twodlist,new ArrayList<>(),nums,n);
        return twodlist;
    }
    private static void sub2(int ind,List<List<Integer>>twodlist,List<Integer>list,int arr[],int n){
            twodlist.add(new ArrayList<>(list));
            for (int i=ind;i<arr.length;i++){
                if (i!=ind && arr[i]==arr[i-1])continue;
                list.add(arr[i]);
                sub2(i+1,twodlist,list,arr,n);
                list.remove(list.size()-1);
        }
    }
}
