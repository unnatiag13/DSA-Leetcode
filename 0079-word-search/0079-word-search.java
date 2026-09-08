class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m =board[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int k =0;
                if(word.charAt(k)==board[i][j]){
                    if(solve(board,word.toCharArray(),i,j,k,vis)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean solve(char[][] board,char[] words,int r ,int c,int k,boolean[][] vis){
        if(k==words.length) return true;
        if(r<0 || c<0 || r>=board.length || c>=board[0].length|| words[k]!=board[r][c]|| vis[r][c]) return false;
        vis[r][c] = true;
        if(words[k]==board[r][c]){
            boolean a1 = solve(board,words,r+1,c,k+1,vis);
            boolean a2 = solve(board,words,r-1,c,k+1,vis);
            boolean a3 = solve(board,words,r,c-1,k+1,vis);
            boolean a4 = solve(board,words,r,c+1,k+1,vis);
            vis[r][c] = false;
            return a1||a2||a3||a4;
        }
        return false;
    }
}