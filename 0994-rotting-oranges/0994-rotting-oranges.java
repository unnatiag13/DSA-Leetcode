class Solution {
    public int orangesRotting(int[][] grid) {
        // WITHOUT VISITED ARRAY AND EFFICIENT
        Queue<int[]> q = new LinkedList<>();
        int time =0;
        int freshCount =0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2) q.offer(new int[]{i,j,0});
                if(grid[i][j]==1) freshCount++;
            }
        }

        int[] trow = {+1,0,-1,0};
        int[] tcol = {0,+1,0,-1};

        while(!q.isEmpty()){
            int row = q.peek()[0];
            int col = q.peek()[1];
            time = q.poll()[2];

            for(int k=0;k<4;k++){
                int i = trow[k];
                int j = tcol[k];
                if(row+i>=0 && row+i<grid.length && col+j<grid[0].length && col+j>=0 &&grid[row+i][col+j]==1){
                    q.offer(new int[]{row+i,col+j,time+1});
                    grid[row+i][col+j]=2;
                    freshCount--;
                }
            }
        }
        if(freshCount==0)
            return time;
        else return -1;
    }
}