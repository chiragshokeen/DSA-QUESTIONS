class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length ;
        if(n == 0  ) return 0 ; 
        if(n == 1 ) return nums[0] ; 
        
        int inc = nums[0] ; //first wala taken
        int exc = 0 ; 
        int ans = 0 ; 
        for( int i = 1 ; i < n-1 ; i++ ){ //so n-1 because last one will not be taken
            
            int ninc = inc ;
            int nexc = exc ; 
            
            inc = exc + nums[i] ;
            exc = Math.max(ninc , nexc ) ; 
            
        }
        
        ans = Math.max( exc , inc ) ; 
        
        
        
          inc = nums[1] ; //first wala skipped
         exc = 0 ; 
         
        for( int i = 2 ; i < n ; i++ ){ //so till n because last one will be taken
            
            int ninc = inc ;
            int nexc = exc ; 
            
            inc = nexc + nums[i] ;
            exc = Math.max(ninc , nexc ) ; 
            
        }
        
        ans  = Math.max( Math.max( inc , exc ) , ans ) ;
        return ans ; 
        
        
    }
}