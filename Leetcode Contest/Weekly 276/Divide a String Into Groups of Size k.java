//leetcode 2138

// A string s can be partitioned into groups of size k using the following procedure:

// The first group consists of the first k characters of the string, the second group consists of the next k characters of the string, and so on. Each character can be a part of exactly one group.
// For the last group, if the string does not have k characters remaining, a character fill is used to complete the group.
// Note that the partition is done so that after removing the fill character from the last group (if it exists) and concatenating all the groups in order, the resultant string should be s.

// Given the string s, the size of each group k and the character fill, return a string array denoting the composition of every group s has been divided into, using the above procedure.

 
// Input: s = "abcdefghi", k = 3, fill = "x"
// Output: ["abc","def","ghi"]

class Solution {
    public String[] divideString(String s, int k, char fill) {
        
       
        int n = s.length() ;
        
        ArrayList<String> list = new ArrayList<>() ; 
        int K = k ;
        int p = 0 ; 
        for( int i = 0 ; i < n ; i=i+k ){
            
             StringBuilder sb = new StringBuilder() ;
             K = k ; 
            for( int j = i ; j < i+k  ; j++ ){
                
                if(j< s.length())sb.append( s.charAt(j) ) ; 
				else sb.append( fill ) ; 
            }
            
            list.add( sb.toString() )  ; 
            
            
        }
        
        String[] ans = new String[list.size()] ; 

        list.toArray(ans) ; 
        return ans ; 
    }
}