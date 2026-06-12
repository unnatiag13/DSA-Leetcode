class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            HashSet<Character> seen = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[row][j]=='.') continue;
                if(seen.contains(board[row][j])) return false;
                seen.add(board[row][j]);
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Character> seen = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
               if(seen.contains(board[j][i])) return false;
               seen.add(board[j][i]);
            }
        }
        for (int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }
        return true;
    }
}