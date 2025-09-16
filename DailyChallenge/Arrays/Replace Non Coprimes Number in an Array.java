class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer>list = new ArrayList<>();

        for (int num : nums){
            while(!list.isEmpty()){
                int curr = list.get(list.size()-1) ;
                int prev = num;

                int gcd = GCD(curr,prev);
                if ( gcd == 1 ){
                    break;
                }
                int LCM = prev / gcd * curr;
                list.remove(list.size()-1);
                num = LCM;
            }
            list.add(num);
        }
        return list;
    }
    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
