class Solution {
    boolean[] cols, diagU, diagD;
    public void helper(char[][] board ,List<List<String>> allBoards, int col ){
        if(col==board.length){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<col;i++){
                temp.add(String.valueOf(board[i]));
            }
            allBoards.add(temp);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(!cols[row] && !diagU[row+col] && !diagD[row-col+board.length-1]){
                board[row][col]='Q';
                cols[row] = diagU[row+col] = diagD[row-col+board.length-1] = true;
                helper(board,allBoards,col+1);
                board[row][col] ='.';
                cols[row] = diagU[row+col] = diagD[row-col+board.length-1] = false;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        cols = new boolean[n];
        diagU = new boolean[2 * n];
        diagD = new boolean[2 * n];
        helper(board,allBoards,0);
        return allBoards;
    }
}