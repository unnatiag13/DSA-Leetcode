class Solution {
    public int minFlips(int a, int b, int c) {
        // 8 - 100
        // 3 - 001
        // 5 - 010
        int cnt =0;
        while(a!=0 || b!=0 || c!=0){
            if((c&1)==1 && (a&1)==0 && (b&1)==0){
                cnt++;
            }else if((c&1)==0){
                if((a&1)!=0 && (b&1)!=0){
                    cnt+=2;
                }else if((a&1)!=0 ||( b&1)!=0){
                    cnt++;
                }
            }
            a>>=1;
            b>>=1;
            c>>=1;
        }
        return cnt;
    }
}