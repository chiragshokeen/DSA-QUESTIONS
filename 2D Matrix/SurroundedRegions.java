class Solution{
    
    public static void mark$dfs(int i , int j , int[][] dir,char[][] board ){
      
      board[i][j] = '$' ; 
      
      for(int d = 0 ; d < dir.length ; d++ ){
          
          int r = i + dir[d][0] ;
          int c = j + dir[d][1] ; 
          
          if(r>=0 && c>=0 && r < board.length && c < board[0].length && board[r][c] == 'O'   ){
              mark$dfs(r , c, dir , board ) ; 
          }
          
      }
      
      
      
      
  }
  
  static char[][] fill(int n, int m, char board[][])
  {
     
      int[][] dir = {{-1 , 0} , {0 , 1} , {1 , 0} , {0 , -1} } ; 
      
      for(int i = 0 ; i < n ; i++ ){
          
          if(board[i][0]  == 'O' ){
              mark$dfs( i , 0 , dir,board) ; 
          }
          if(board[i][m-1] == 'O'){
              
              mark$dfs(i , m-1 , dir , board) ; 
              
          }
          
          
          
      }
      
      
      for(int j = 0 ; j < m ; j++ ){
          
           if(board[0][j]  == 'O' ){
              mark$dfs( 0 , j , dir , board) ; 
          }
          if(board[n-1][j] == 'O'){
              mark$dfs(n-1, j , dir , board) ; 
              
          }
          
          
          
      }
      
      
      for(int i = 0 ; i < n ; i++ ){
          
          for(int j = 0 ; j < m ; j++ ){
              
              
              if(board[i][j] == 'O' ){
                  board[i][j] = 'X' ;
              }
              if(board[i][j] == '$' ){
                  board[i][j] ='O' ; 
              } 
              
              
          }
          
      }
      
      
      
      return board ; 
      
  }
}