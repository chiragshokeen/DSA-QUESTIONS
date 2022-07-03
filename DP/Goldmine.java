class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        //if(n == 0 || m == 0) return 0 ; 
        
        int[][] dp = new int[n][m] ; 
        //when single row array
        if( n == 1 ){
            int ans = 0 ; 
            for(int i = 0 ; i < n ; i++  ){
                for(int j = 0 ; j < m ; j++){
                    ans+=M[i][j] ;
                }
            }
            return ans ;
        }
        
       for(int[] rows:dp)
            Arrays.fill(rows, 0);
        
        for(int j = m-1 ; j>= 0  ; j-- ){
            
            for(int i = n-1 ; i >= 0 ; i-- ){
                
                if(j == m-1 ){
                    dp[i][j] = M[i][j] ; 
                    continue;
                }
                 else if(i == 0 ){
                    
                    dp[i][j] = Math.max(dp[i][j+1] , dp[i+1][j+1] ) + M[i][j] ; 
                    
                }
                else if(i == n-1){
                    dp[i][j] = Math.max(dp[i][j+1] , dp[i-1][j+1] ) + M[i][j] ; 
                }
                else{
                    
                    dp[i][j] = Math.max(Math.max(dp[i-1][j+1] , dp[i][j+1] ) , dp[i+1][j+1] ) + M[i][j] ; 
                    
                }
                
                
            }
            
        }
        
        int ans = dp[0][0] ; 
        for(int i = 1 ; i < n ; i++ ){
            if(dp[i][0] > ans ){
                ans = dp[i][0] ; 
            }
        }
        
        return ans ; 
    }
}