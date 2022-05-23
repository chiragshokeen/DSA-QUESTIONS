class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length ;
        int n = matrix[0].length ;
        
      
        
        int si = 0 ; 
        int ei = m*n - 1 ;
        
        while( si <= ei ){
            
            int mid = (si + ei)/2 ; 
            
            if( matrix[ mid / n ][mid % n ] == target ){
                return true ; 
            }else if( matrix[ mid / n ][mid % n ] < target ){
                si = mid+1;
            }else{
                ei = mid-1;
            }
            
            
            
        }
        
        return false;
        
    }
}