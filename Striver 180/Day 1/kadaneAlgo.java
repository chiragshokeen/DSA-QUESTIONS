class kadaneAlgo {
    public static int maxSubArray(int[] nums) {
        
        int gmaxSum = -(int)1e9 ; 
        int runningMax = 0 ; 
        
        for( int i = 0; i < nums.length ; i++ ){
            
            runningMax+=nums[i]; 
            gmaxSum = Math.max( gmaxSum , runningMax );
            
            if( runningMax < 0  ){
                runningMax = 0 ; 
            }
            
            
            
        }
        
        return gmaxSum ; 
    }

    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(arr) ;
        System.out.println(ans) ;
    }
}