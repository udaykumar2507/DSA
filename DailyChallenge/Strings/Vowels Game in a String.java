class Solution {
    public boolean doesAliceWin(String s) {
        int cnt = 0;
        int n = s.length();
        for (int i = 0;i < n ; i++ ){
            char c = s.charAt(i);
            if ( c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u'){
                cnt++;
            }
        }
        if (cnt == 0){
            return false;
        }
        return true;
    }
}
