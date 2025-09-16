class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        Set<Character>set = new HashSet<>();
        for (char c:brokenLetters.toCharArray()){
            set.add(c);
        }
        int res = 0;
        for (String s : words){
            int flag = 0;
            for (char c1 : s.toCharArray()){
               if (set.contains(c1)){
                flag = 1;
                break;
               }
            }
            if (flag == 0){
                res++;
            }
        }
        return res;

    }
}
