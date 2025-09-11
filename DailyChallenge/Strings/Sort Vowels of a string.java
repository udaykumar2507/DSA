class Solution {
    public String sortVowels(String s) {
        int len = s.length();
        int vowel_cnt = 0;
        for (int i =0; i<len ; i++){
            char c = s.charAt(i);
            if ( c == 'a'|| c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'O' || c == 'o' || c == 'u' || c == 'U'){
                vowel_cnt++;
            }
        }

        char [] vowels = new char [vowel_cnt];
        int j = 0;
        for (int i =0; i<len ; i++){
            char c = s.charAt(i);
            if ( c == 'a'|| c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'O' || c == 'o' || c == 'u' || c == 'U'){
                vowels[j] = c;
                j++;
            }
        }

        Arrays.sort(vowels);
        j = 0;
        String ans = "";
        for (int i =0; i<len ; i++){
            char c = s.charAt(i);
            if ( c == 'a'|| c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'O' || c == 'o' || c == 'u' || c == 'U'){
                ans += vowels[j];
                j++;
            }else{
                ans += c;
            }
        }

        return ans;        

    }
}
