class HelloWorld {
    public static void main(String[] args) {
          String S="ggkkmmnnoo";
          String s=dup(S);
          System.out.print(s);
        
    }
    private static String dup(String s){
        int n=s.length();
        if(n==0){
            return s;
        }
        else if (n==1 || s.charAt(0)!=s.charAt(1)){
            return s.charAt(0)+dup(s.substring(1));
        }
        else{
            int ind=0;
            while(ind<n &&s.charAt(ind)==s.charAt(0) ){
                ind++;
            }
            return s.charAt(0)+dup(s.substring(ind));
        }
    }
}
