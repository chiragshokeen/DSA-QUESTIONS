//leetcode 76
//Input: s = "ADOBECODEBANC", t = "ABC"
//Output: "BANC"
//Smallest window in a string containing all the characters of another string 
class Solution {
    public String minWindow(String s, String t) {
        
        int ns = s.length() ;
        int nt = t.length() ;
        
        int si = 0 ; 
        int ei = 0 ;
        int head = 0  ; 
        int len = (int)1e8 ; 
        int[] map = new int[128] ; 
        for(int i = 0 ; i < nt ; i++ ){
            map[t.charAt(i) ]++ ; 
        }
        int req = nt ; 
        while(ei < ns ){
            
            if(map[s.charAt(ei++ )]-- > 0   ) req-- ; 
            
            while(req == 0  ){
                
                if(ei - si < len ) len = ei - (head = si ) ; 
                
                if(map[s.charAt(si++ )]++ == 0   )req++ ; 
                
            }
            
            
        }
        
        return len == (int)1e8 ? "" : s.substring(head , head + len ) ; 
    }
}