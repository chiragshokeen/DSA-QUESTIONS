//leetcode 930
// Input: nums = [1,0,1,0,1], goal = 2
// Output: 4
// Explanation: The 4 subarrays are bolded and underlined below:
// [1,0,1,0,1]
// [1,0,1,0,1]
// [1,0,1,0,1]
// [1,0,1,0,1]

class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
      
        
        int n = A.length ;
        int count = 0 ; 
        HashMap<Integer , Integer> map = new HashMap<>() ; 
        int psum = 0 ; 
        map.put(0,1 ) ; 
        for(int i = 0 ;i < n ; i++ ){
            
            psum+=A[i] ;
            if(map.containsKey(psum - S ) ){
                count+=map.get(psum - S ) ; 
                 map.put(psum , map.getOrDefault(psum , 0  ) + 1 ) ;
            }else {
                map.put(psum , map.getOrDefault(psum , 0  ) + 1 ) ; 
            }
            
            
        }
        
       return count ; 
        
    }
    
 
    
}