class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        int flip=0;
        while(ans>1){
            flip+=ans&1;
            ans=ans>>1;
        }
        if (ans==1){
            flip+=ans;
        }
        return flip;
        
    }
}
