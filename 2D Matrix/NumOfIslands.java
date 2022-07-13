class Solution {
    public int numIslands(char[][] grid) {
        
        int n = grid.length ;
        int m = grid[0].length ;
        
        
        boolean[][] vis = new boolean[n][m] ;
        
        int count = 0 ; 
        
        for( int i = 0 ; i < n ; i++ ){
            for( int j = 0 ; j < m ; j++ ){
                
                if( grid[i][j] == '1' && vis[i][j] == false ){
                    dfs( grid , vis , i , j  ) ;
                    count++ ; 
                }
                
                
                
            }
        }
        
        for( int i = 0 ; i < n ; i++ ){
            for( int j = 0 ; j < m ; j++ ){
                System.out.print( vis[i][j]+" " );
            }
            System.out.println() ; 
        }
        
        return count; 
        
    }
    
    
    public void dfs( char[][] grid , boolean[][] vis , int i , int j ){
        
        
        if( i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' |
 vis[i][j] == true ){
            return ; 
        }
        
        vis[i][j]=true; 
        
        dfs( grid , vis , i , j + 1   ) ;
        dfs(  grid , vis , i+1 , j   ) ; 
        dfs( grid , vis , i , j - 1   ) ;
        dfs(  grid , vis , i-1 , j   ) ; 
        
        
        return;
        
        
    }
    
    
    
}