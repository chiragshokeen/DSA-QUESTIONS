class Solution {
    public int firstMissingPositive(int[] nums) {
        
        for( int i = 0 ; i < nums.length ; i++ ){
            
            if( nums[i] <= 0  ){ //agar 0 ya negitve hai usko array size+1 set krdo because that index wont be present
                nums[i] = nums.length + 1 ; 
            }
            
        }
        
        for( int i = 0 ; i < nums.length ; i++ ){
            
            int index = Math.abs(nums[i]) ;
            if( index <= nums.length   ){
                nums[index-1]= -Math.abs(nums[index-1] ) ;
            } 
            
            
        }
        
        for(int i = 0 ; i < nums.length ; i++ ){
            if( nums[i] >= 1 ){
                return i+1 ; 
            }
        }//yahan se kuch return ni hua mtlb 1 se n mei koi missing nahi hai
        //to n + 1 return krdo
        
        
        return nums.length+1 ;
    }
}