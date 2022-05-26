class Solution {
    public int findClosestNumber(int[] nums) {
        
        Arrays.sort(nums) ;
        int ans = (int)1e9 ;
        int mintillnow = (int)1e9;
        
        for( int ele : nums ){
            
            int dist = Math.abs(ele - 0 ) ;
            //mintillnow = Math.min( mintillnow , dist ) ;
            
            if( dist <= mintillnow  ){
                ans = ele ;
                mintillnow = dist;
            }
            
            
        }
      
        return ans;
        
    }
}