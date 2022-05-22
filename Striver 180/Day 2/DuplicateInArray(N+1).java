class Solution {
    public int findDuplicate(int[] nums) {
        
        int ans = -1 ;
        int n = nums.length ; 
        
        for( int i = 0 ; i < n ; i++ ){
            
            int index = Math.abs( nums[i] ) ;
            
            if( nums[index] < 0 ){
                ans = index ;
                break ;
            }else{
                nums[index]*=-1 ; 
            }
            
            
        }
        
        return ans ; 
        
        
    }
}