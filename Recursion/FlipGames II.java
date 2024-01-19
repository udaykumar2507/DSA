public class Solution {
    public static boolean canNinjaWin(String str) {
        for (int i=0;i<str.length()-1;i++){
            if (str.charAt(i)=='$' && str.charAt(i+1)=='$'){
                String nextState=str.substring(0,i)+"**"+str.substring(i+2);
                if (!canNinjaWin(nextState)){
                    return true;
                }
        }        
    }
    return false;
}
}
