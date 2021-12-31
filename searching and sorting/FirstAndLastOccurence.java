//leetcode 34
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109
// nums is a non-decreasing array.
// -109 <= target <= 109


class Solution {
    public int[] searchRange(int[] arr, int data) {
        
       int[] ans = new int[2] ;
        ans[0] = binarysearchFirstIndex(arr , data  ) ;
        ans[1] = binarysearchLastIndex(arr , data  ) ;
            
        
        return ans ; 
            
        }
        
    public int binarysearchFirstIndex(int[] nums , int target){
         int si = 0 , ei = nums.length - 1 ;
        
        while(si <= ei ){
            
            int mid = (si + ei)/2 ;
            
            if(nums[mid] == target ){
                if(mid - 1 >= 0 && nums[mid-1] == target  ) ei = mid-1 ;
                else return mid ;
            
            }
            
            
            else if(nums[mid] > target ) ei = mid-1 ;
            else si = mid + 1 ;
            
            
        }
        return -1 ;
    }
    
    public int binarysearchLastIndex(int nums[] , int target){
         int si = 0 , ei = nums.length - 1 ;
        
        while(si <= ei ){
            
            int mid = (si + ei)/2 ;
            
            if(nums[mid] == target ){
                if(mid + 1 < nums.length && nums[mid+1] == target  ) si = mid + 1 ;
                 else return mid ;
            }
        
            else if(nums[mid] > target ) ei = mid-1 ;
            else si = mid + 1 ;
            
            
        }
        return -1 ;
        
        
    }
    
    
}