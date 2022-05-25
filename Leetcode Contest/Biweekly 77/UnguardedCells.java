class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        
        
        int[][] matrix = new int[m][n] ;
        
        for( int[] g : guards ){
            matrix[g[0]][g[1]] = 1;
        }
        
          for( int[] w : walls ){
            matrix[w[0]][w[1]] = 2;
        }
        
        int count = 0 ; 
        
        for( int i = 0 ; i < m ; i++ ){
            for( int j = 0 ; j < n ; j++ ){
                
                if( matrix[i][j] == 1 ){
                    helper( i , j , matrix , m , n ) ;
                    
                }
                
            }
        }
        
          for( int i = 0 ; i < m ; i++ ){
            for( int j = 0 ; j < n ; j++ ){
                
                if( matrix[i][j] == 0 ){
                    count++;
                    
                }
                // System.out.print(matrix[i][j] +" ");
                
            }
              // System.out.println() ; 
        }
        
        return count;
        
        
    }
    
    public void helper( int i , int j , int[][] matrix , int m , int n ){
        
        
       //right
        
        for(int k = j+1 ; k < n ; k++){
            if(matrix[i][k] == 1 || matrix[i][k] == 2){
                break;
            }else{
                matrix[i][k] = -1;
            }
        }
        
       // down
        
          for(int k = i+1 ; k < m ; k++){
            if(matrix[k][j] == 1 || matrix[k][j] == 2){
                break;
            }else{
                matrix[k][j] = -1;
            }
        }
        
        //left
        
          for(int k = j-1 ; k >= 0 ; k--){
            if(matrix[i][k] == 1 || matrix[i][k] == 2){
                break;
            }else{
                matrix[i][k] = -1;
            }
        }
        
        //up
        
           for(int k = i-1 ; k >= 0  ; k--){
            if(matrix[k][j] == 1 || matrix[k][j] == 2){
                break;
            }else{
                matrix[k][j] = -1 ;
            }
        }
        
        
        return;
        
    }
    
    
}