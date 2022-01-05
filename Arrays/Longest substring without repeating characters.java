//leetcode 003

class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        
        int[] map = new int[128] ; 
        int n = s.length() ; 
        int count = 0 ; 
        int si = 0 ; 
        int ei= 0 ; 
        int len = 0 ; 
        
        while( ei < n ){
            
            if( map[s.charAt(ei++)]++ > 0 ){
                
                count++ ; 
        
            }
            
            while(count > 0 ){
                
                if( map[s.charAt(si++)]-- > 1  ){
                    count-- ; 
                }
                
            }
            
            len = Math.max(len , ei-si) ; 
            
            
        }
        
        return len ; 
        
        

        
    }
}