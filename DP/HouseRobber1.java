//leetcode 198

class Solution {
    public int rob(int[] nums) {
        
        
        int lootna = 0 ;
        int nhilootna = 0 ; 
        
        for( int i = 0 ; i < nums.length ; i++ ){
            int temp = nhilootna ; 
            nhilootna = Math.max( lootna , nhilootna );
            lootna = nums[i] + temp ;
             
            
        }
        
        
        return Math.max( lootna , nhilootna ) ; 
        
        
        
        
    }
}