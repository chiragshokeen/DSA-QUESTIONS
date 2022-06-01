class Solution {
    public int waysToSplitArray(int[] nums) {
        
        int n = nums.length;
        long[] suf = new long[nums.length] ;
        suf[n-1] = nums[n-1] ;
        int count = 0 ;
        for( int i = n-2 ; i>= 0 ; i-- ){
            
            suf[i] = suf[i+1] + (long)nums[i] ;
            
        }
        
        long sum = 0 ; 
        for( int i = 0 ; i < n-1 ; i++ ){
            
            sum+= (long)nums[i];
            if( sum >= suf[i+1] ){
                count++;
            }
            
        }
        
        return count;
        
        
    }
}