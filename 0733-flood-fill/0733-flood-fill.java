class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;

        int initColor = image[sr][sc];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr,sc});
        image[sr][sc] = color;
        int[] rowt = {+1,0,-1,0};
        int[] colt = {0,+1,0,-1};
        while(!q.isEmpty()){
            int row = q.peek()[0];
            int col = q.peek()[1];
            q.poll();
            for(int k=0;k<4;k++){
                int i = rowt[k];
                int j = colt[k];
                if(row+i>=0&&row+i<image.length && col+j>=0&&col+j<image[0].length && image[row+i][col+j]==initColor){
                    q.offer(new int[]{row+i,col+j});
                    image[row+i][col+j] = color;
                }
            }
        } 
        return image;
    }
}