class Solution {
    public static boolean isSafe(int row,int col, char[][] board){
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q') return false;
        }
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q') return false;
        }
        int r,c;
        for(c =col,r=row; c>=0 && r>=0; c--,r--){
            if(board[r][c]=='Q') return false;
        }
        for(c =col,r=row; c<board.length && r>=0; c++,r--){
            if(board[r][c]=='Q') return false;
        }
        for(r=row,c =col; c>=0 && r<board.length; c--,r++){
            if(board[r][c]=='Q') return false;
        }
        for(r=row,c =col; c<board.length && r<board.length; c++,r++){
            if(board[r][c]=='Q') return false;
        }
        return true;
    }
    public static void saveBoard(List<List<String>> allBoards , char[][] board){
        List<String> newBoard = new ArrayList<>();
        for(int row=0;row<board.length;row++){
            String currRow = "";
            for(int col=0;col<board.length;col++){
                if(board[row][col]=='Q') 
                    currRow+="Q";
                else 
                    currRow+=".";
            }
            newBoard.add(currRow);
        }
        allBoards.add(newBoard);
    }
    public void helper(char[][] board ,List<List<String>> allBoards, int col ){
        if(col==board.length){
            saveBoard(allBoards,board);
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board,allBoards,col+1);
                board[row][col] ='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,allBoards,0);
        return allBoards;
    }
}