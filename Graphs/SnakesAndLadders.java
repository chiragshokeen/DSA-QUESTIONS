class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        
        LinkedList<Integer> que = new LinkedList<>() ;
        que.add(1) ;
        
        boolean[][] vis = new boolean[n][n] ;
        vis[n-1][0] = true ; //first pos marked visited
        int step = 0 ;
        
        while( que.size() > 0 ){
            
            int size = que.size() ;
            while(size-- > 0 ){
                
                int rem = que.removeFirst() ;
                if( rem == n*n ) return step;
                
                for(int k = 1 ; k <= 6 ; k++  ){
                    if( k + rem > n*n ) break ;
                    
                    int[] cord = find( k+rem , n ) ; 
                    int r = cord[0] ;
                    int c = cord[1] ;
                    
                    if( vis[r][c] == true ){
                        continue;
                    }
                    vis[r][c] = true ;
                    if( board[r][c] != -1 ){
                        que.addLast( board[r][c] );
                    }else{
                        que.addLast(k+rem) ;
                    }
                    
                }
                
                
            }
            
            step++ ;
        }
        return -1 ; 
    }
    
    public int[] find( int curr ,  int n ){
        
        int r = n - (curr - 1  )/n -1 ;
        int c = (curr-1) % n ; 
        
        if( r % 2 ==n % 2  ){
            return new int[]{r , n-1-c} ; 
        }else{
            return new int[]{r , c} ; 
        }
        
        
    }
    
    
}