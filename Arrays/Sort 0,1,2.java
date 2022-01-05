//leetcode 75

//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]

class Solution {
    public void sortColors(int[] nums) {
        
        int p0 = -1 ; 
        int p2 = nums.length ; 
    
        int i = 0 ;
        while( i<p2 ){
            
            if( nums[i] == 1 ){
                i++ ; 
            }
             else if( nums[i] == 0 ){
                p0++ ; 
                swap( nums , p0 , i ) ; 
                i++ ; 
            }
            else if( nums[i] == 2 ){
                p2-- ; 
                swap(nums , i , p2) ; 
            }
            
            
        }
        
        return ; 
    }

    public int[] swap( int[] arr , int i , int j ){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp; 
        return arr ; 
    }
    
}