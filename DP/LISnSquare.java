class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length ;
        int[] dp = new int[n] ;
        Arrays.fill(dp , 1 ) ;
        
        return lengthOfLIS(nums ,dp  ) ;
        
        
    }
    
    public int  lengthOfLIS(int[] arr , int[] dp ){
        
//         if(idx == 0 ){
//             return dp[idx] = 1 ;
//         }
        int n = arr.length ;
        int maxlen = 0 ;
        for(int i = 0 ; i<n ; i++ ){
            
            for(int j = i-1 ; j>=0 ; j--){
                if(arr[i]>arr[j] ){
                    dp[i] = Math.max(dp[j] +1 , dp[i] ) ;
                    
                }
                
            }
            
        }
        
        for(int i = 0 ; i < dp.length ; i++ ){
            if(dp[i] > maxlen ){
                maxlen = dp[i] ; 
            }
        }
        
        return maxlen ;
        
        
    }
}