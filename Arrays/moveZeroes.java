//leetcode 283 
//input : nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

class Solution {
    public void moveZeroes(int[] nums) {
        
        
        int n = nums.length ; 
        if(n == 0 || n == 1){
            return ; 
        }
        
        int pivot = -1;
        int idx = 0  ; 
        while(idx != n){
            
            if(nums[idx]!=0 ){
                pivot++ ; 
                swap(pivot , idx , nums);
                idx++ ; 
            }else{
                idx++ ; 
            }
            
            
            
            
        }
        
        return ; 
        
        
    }
    
    public void swap(int i , int j ,int[] arr){
        
        int temp = arr[i] ;
        arr[i] = arr[j] ; 
        arr[j] = temp ; 
        return; 
        
    }
    
}