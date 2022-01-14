//2108
// Input: words = ["abc","car","ada","racecar","cool"]
// Output: "ada"
// Explanation: The first string that is palindromic is "ada".
// Note that "racecar" is also palindromic, but it is not the first.
// Example 2:

// Input: words = ["notapalindrome","racecar"]
// Output: "racecar"
// Explanation: The first and only string that is palindromic is "racecar".

class Solution {
    public String firstPalindrome(String[] words) {
        
        int flag = 0 ;
        for( int i = 0 ; i < words.length ; i++ ){
            
            String s = words[i] ;
            if( ispalin(s) == true ){
                return s ; 
            }
            
            
        }
        
        return "" ; 
        
    }
    
    public boolean ispalin(String s){
        
        int l = 0 ; 
        int r = s.length()-1 ; 
        while( l<=r ){
            
            if( s.charAt(l) == s.charAt(r) ){
                l++ ; 
                r-- ;
            }else{
                return false;
            }
            
        }
        return true ; 
        
    }
    
}