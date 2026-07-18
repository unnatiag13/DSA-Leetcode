class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] outdeg = new int[n+1];
        int[] indeg =new int[n+1];
        for(int[] t:trust){
            int a=t[0] , b=t[1];
            indeg[b]++;
            outdeg[a]++;
        }
        for(int i=1;i<=n;i++){
            if(indeg[i]==n-1 && outdeg[i]==0) return i;
        }
        return -1;
    }
}