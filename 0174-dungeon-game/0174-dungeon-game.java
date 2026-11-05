class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int[][] dp = new int[dungeon.length][dungeon[0].length];
        return calculate_MinimumHP(dungeon,0,0,dp);
    }
    public int calculate_MinimumHP(int[][] dungeon,int cr,int cc,int[][]dp) {
        if(cr>=dungeon.length || cc>= dungeon[0].length){
            return Integer.MAX_VALUE;
        }
        if(cr== dungeon.length-1 && cc==dungeon[0].length-1){
            return 1-dungeon[cr][cc]>0?1-dungeon[cr][cc]:1;
        }
        if(dp[cr][cc]!=0) return dp[cr][cc];
        int ld = calculate_MinimumHP(dungeon,cr,cc+1,dp);
        int rd = calculate_MinimumHP(dungeon,cr+1,cc,dp);
        int HP= Math.min(ld,rd) - dungeon[cr][cc];

        return dp[cr][cc] = HP>0 ? HP : 1;
    }
}