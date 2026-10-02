class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ll = new ArrayList<>();
        printCounting(0,n,ll);
        return ll;
    }
    public static void printCounting(int ans,int end,List<Integer> ll){
        if(ans>end) return;
        if(ans!=0) ll.add(ans);
        for(int i=0;i<=9;i++){
            if(i==0 && ans ==0) continue;
            if(ans*10+i<=end) printCounting(ans*10+i,end,ll);
        }
    }
}