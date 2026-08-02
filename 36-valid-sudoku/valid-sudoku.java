class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>set = new HashSet<Character>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!set.add(board[i][j])) return false;
                }
            }
            set.clear();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i]!='.'){
                    if(!set.add(board[j][i])) return false;
                }
            }
            set.clear();
        }

        for(int i=0;i<9;i++){
            for(int j=3*(i/3);j<(3*(i/3))+3;j++){
                for(int k=(3*i)%9;k<((3*i)%9)+3;k++){
                    if(board[j][k]!='.'){
                        if(!set.add(board[j][k])) return false;
                    }
                }
            }
            set.clear();
        }
        return true;
    }
}