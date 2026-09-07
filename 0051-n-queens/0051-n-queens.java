class Solution {
    boolean[] cols, diagU, diagD;
    public static void saveBoard(List<List<String>> allBoards , char[][] board){
        List<String> newBoard = new ArrayList<>();
        for(int row=0;row<board.length;row++){
            StringBuilder currRow = new StringBuilder();
            for(int col=0;col<board.length;col++){
                if(board[row][col]=='Q') 
                    currRow.append("Q");
                else 
                    currRow.append(".");
            }
            newBoard.add(currRow.toString());
        }
        allBoards.add(newBoard);
    }
    public void helper(char[][] board ,List<List<String>> allBoards, int col ){
        if(col==board.length){
            saveBoard(allBoards,board);
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
        cols = new boolean[n];
        diagU = new boolean[2 * n];
        diagD = new boolean[2 * n];
        helper(board,allBoards,0);
        return allBoards;
    }
}