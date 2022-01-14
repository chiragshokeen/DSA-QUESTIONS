//leetcode 2109

// Input: s = "LeetcodeHelpsMeLearn", spaces = [8,13,15]
// Output: "Leetcode Helps Me Learn"
// Explanation: 
// The indices 8, 13, and 15 correspond to the underlined characters in "LeetcodeHelpsMeLearn".
// We then place spaces before those characters.


// Input: s = "icodeinpython", spaces = [1,5,7,9]
// Output: "i code in py thon"
// Explanation:
// The indices 1, 5, 7, and 9 correspond to the underlined characters in "icodeinpython".
// We then place spaces before those characters.


class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        HashSet<Integer> set = new HashSet<>() ;
        for( int val : spaces ){
            set.add(val) ;
        }
        
        StringBuilder sb = new StringBuilder() ;
        
        for( int i = 0  ; i < s.length() ; i++ ){
            
                 if( set.contains(i) ){
                    sb.append(" ") ;
                    sb.append(s.charAt(i));
                
                }else{
                    sb.append(s.charAt(i)) ;
                    
                }
                
         }
        
        return sb.toString() ; 
        
    }
}