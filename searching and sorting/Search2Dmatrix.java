//leetcode 74
// Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

// Integers in each row are sorted from left to right.
// The first integer of each row is greater than the last integer of the previous row.
 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length;
        int m = matrix[0].length ; 
         if(n == 0 || m == 0 ) return false ;
        
        int si = 0 ; 
        int ei = n*m-1;
        
        while( si <= ei ){
            
            int mid = (si+ei)/2;
            int midele = matrix[mid/m][mid%m] ;
            
            if( midele == target ){
                return true ;
            }else if( midele > target ){
                ei =mid-1;
            }else{
                si = mid+1;
            }
            
            
            
        }
        
        return false;
    }
}