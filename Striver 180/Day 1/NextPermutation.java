class Solution {
    public void nextPermutation(int[] nums) {
        
        //better code written
        if( nums == null || nums.length<=1  ){
            return ; 
        }
        
        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1] ){
            i--;
        }
        if(i>=0){
            int j = nums.length-1 ;
            while( nums[j] <= nums[i] )j--;
            swap( nums , i , j );
        }
        
        reverse(nums , i+1 , nums.length-1) ; 
        return;
 
    }
    
    public static void swap( int[] arr , int i , int j ){
        int temp = arr[j] ;
        arr[j] = arr[i] ;
        arr[i] = temp;
        return;
    }
    
    public static void reverse( int[] arr , int l , int r ){
        while( l<=r ){
            swap( arr , l , r ) ;
            l++ ; 
            r--;
        }
        
        return;
    }
    
}