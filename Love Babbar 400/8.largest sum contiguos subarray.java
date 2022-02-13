class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        
        long gmax = -(int)1e9 ; 
        long rmax = 0 ; 
        
        for( int i = 0 ; i <  n ; i++ ){
            
            rmax = rmax + arr[i] ;
            gmax = Math.max( rmax , gmax ) ; 
          
             if(rmax < 0){
                rmax = 0 ; 
            }
            
        }
        
        return gmax ; 
        
    }
    
}
