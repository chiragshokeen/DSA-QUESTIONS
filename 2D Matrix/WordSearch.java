public class Solution {
    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int n = board.length ;
        int m = board[0].length ; 
        visited = new boolean[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++){
                if((word.charAt(0) == board[i][j]) && search(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean search(char[][]board, String word, int i, int j, int index){
        if(index == word.length()){
            return true;
        }
        
        if(i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index) || visited[i][j]){  
            return false;
        }
        
        visited[i][j] = true;
        if(search(board, word, i-1, j, index+1) ||  //upper
           search(board, word, i+1, j, index+1) ||  //down
           search(board, word, i, j-1, index+1) || //left
           search(board, word, i, j+1, index+1)){  //right
            return true;
        }
        
        visited[i][j] = false; //wapsi jate hue mark false
        return false;
    }
}