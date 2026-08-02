class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>rowSet = new HashSet<Character>();
        HashSet<Character>columnSet = new HashSet<Character>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!rowSet.add(board[i][j])) return false;
                }
                if(board[j][i]!='.'){
                    if(!columnSet.add(board[j][i])) return false;
                }
            }
            rowSet.clear();
            columnSet.clear();
        }

        for(int i=0;i<9;i++){
            for(int j=3*(i/3);j<(3*(i/3))+3;j++){
                for(int k=(3*i)%9;k<((3*i)%9)+3;k++){
                    if(board[j][k]!='.'){
                        if(!rowSet.add(board[j][k])) return false;
                    }
                }
            }
            rowSet.clear();
        }

        return true;
    }
}