import java.util.StringTokenizer;
class Solution {
    public int compareVersion(String version1, String version2) {
        StringTokenizer tokenizer1=new StringTokenizer(version1,".");
        List<String>tokens1=new ArrayList<>();
        while(tokenizer1.hasMoreTokens()){
            tokens1.add(tokenizer1.nextToken());
        }
        StringTokenizer tokenizer2=new StringTokenizer(version2,".");
        List<String>tokens2=new ArrayList<>();
        while(tokenizer2.hasMoreTokens()){
            tokens2.add(tokenizer2.nextToken());
        }
        if (tokens1.size()>tokens2.size()){
            for (int i=tokens2.size();i<tokens1.size();i++){
                tokens2.add("0");
            }
        }
        else if (tokens2.size()>tokens1.size()){
            for (int i=tokens1.size();i<tokens2.size();i++){
                tokens1.add("0");
            }
        }
        for (int i=0;i<tokens1.size();i++){
            if (Integer.parseInt(tokens1.get(i))>Integer.parseInt(tokens2.get(i))){
                return 1;
            }else if (Integer.parseInt(tokens1.get(i))<Integer.parseInt(tokens2.get(i))){
                return -1;
            }
        }
        return 0;
    }
}
