//leetcode 152
class Solution {
    public int maxProduct(int[] nums) {
        
       int n = nums.length ;
        int ans = -(int)1e9;
        int cprod = 1;
        
        
        for( int i = 0 ; i < n ; i++ ){
            cprod = cprod*nums[i];
            ans = Math.max(ans , cprod) ;
            if(cprod == 0){
                cprod = 1;
            }
        }
        cprod = 1;
         for( int i = n-1 ; i >=0 ; i-- ){
            cprod = cprod*nums[i];
            ans = Math.max(ans , cprod) ;
            if(cprod == 0){
                cprod = 1;
            }
        }
        
        return ans;
           
    }
}