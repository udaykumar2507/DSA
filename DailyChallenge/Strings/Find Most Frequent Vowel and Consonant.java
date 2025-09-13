class Solution {
    public int maxFreqSum(String s) {
        int [] hash = new int [26];
        int n = s.length();
        int vowelmax = 0;
        int consonantmax = 0;
        for (char c : s.toCharArray()){
            int val = c -'a';
            hash[val]++;
        }
        for (char c : s.toCharArray()){
            int val = c -'a';
            if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowelmax = Math.max(vowelmax,hash[val]);
            }else{
                consonantmax = Math.max(consonantmax,hash[val]);
            }
        }
        return vowelmax + consonantmax;
    }
}
