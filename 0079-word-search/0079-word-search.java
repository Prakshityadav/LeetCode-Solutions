class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
        for(int j = 0; j < board[0].length; j++) {
            if(backtrack(board, i, j, word, 0)) {
                return true;
            }
        }
    }
    return false;
    }
    boolean backtrack(char[][] board,int row,int col,String word,int idx){
        if(idx==word.length()) return true;

        if(row<0 || col<0 || row>=board.length || col>=board[0].length || board[row][col]!=word.charAt(idx)){
            return false;
        }

        char temp=board[row][col];
        board[row][col]='#';
        boolean found=backtrack(board,row+1,col,word,idx+1)||
                    backtrack(board,row-1,col,word,idx+1)||
                    backtrack(board,row,col+1,word,idx+1)||
                    backtrack(board,row,col-1,word,idx+1);

        board[row][col]=temp;
        return found;
    }
}