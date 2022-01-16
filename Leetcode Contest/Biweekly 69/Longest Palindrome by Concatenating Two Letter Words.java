//leetcode 2131

// You are given an array of strings words. Each element of words consists of two lowercase English letters.

// Create the longest possible palindrome by selecting some elements from words and concatenating them in any order. Each element can be selected at most once.

// Return the length of the longest palindrome that you can create. If it is impossible to create any palindrome, return 0.

// A palindrome is a string that reads the same forward and backward.

// Input: words = ["lc","cl","gg"]
// Output: 6


class Solution {
    public int longestPalindrome(String[] words) {
        
        HashMap<String,Integer> map = new HashMap<>() ;
        int ans = 0 ; 
        for( String s : words ){
            
            String rev = reverse(s) ;
            
            if( map.containsKey(rev) ){
                
                ans+=4 ; 
                int val = map.get(rev) ;
                val-- ; 
                if(val == 0) map.remove(rev) ;
                else map.put( rev , val ) ; 
                
                
            }else{
                map.put( s , map.getOrDefault(s , 0)+ 1 ) ;
            }
               
        } 
        
        for( String k : map.keySet() ){
            
            if( k.charAt(0) == k.charAt(1) ){
                ans+=2 ;
                break;
            }
            
        }
        
        return ans ; 
        
    }
    
    public String reverse(String s){
        
        StringBuilder sb = new StringBuilder() ;
        int n = s.length() ; 
        for( int i = n-1 ; i>= 0 ; i-- ){
            sb.append(s.charAt(i)) ;
            
        }
        
        return sb.toString() ; 
        
    }
}