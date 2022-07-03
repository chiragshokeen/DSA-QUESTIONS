//leetcode

class Solution {
    
    public int uniquePaths(int m, int n) {
        
        int[][] dp = new int[m][n] ;
        
        helper( dp , 0 , 0 , m , n  );
        
        return dp[0][0] ; 
        
        
    }
    
    public int helper( int[][] dp , int sr , int sc , int m , int n ){
        
        if( sr < 0 || sr >= m || sc < 0 || sc >= n  ){
            return 0 ; 
        }
        
      
        if( sr == m-1 && sc == n-1 ){
            return dp[sr][sc] = 1;
        }
        
         if( dp[sr][sc] != 0   ){
            return dp[sr][sc] ;
        }
        
        
        int a = helper( dp , sr , sc+1 , m , n  ) ;
        int b = helper( dp , sr+1 , sc, m , n   ) ;
        
        return dp[sr][sc] = a+b ; 
        
        
        
    }
    
}