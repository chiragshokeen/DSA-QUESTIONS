//leetcode 205
// Input: s = "egg", t = "add"
// Output: true
// Example 2:

// Input: s = "foo", t = "bar"
// Output: false
// Example 3:

// Input: s = "paper", t = "title"
// Output: true

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int n = s.length() ;
        int m = t.length() ;
        if(n != m  ) return false;
        HashMap<Character , Boolean> map2 = new HashMap<>() ;
        
        HashMap<Character , Character > map = new HashMap<>() ;
        
        for(int i = 0 ; i < n ; i++ ){
            
            
            
            if(map.containsKey(s.charAt(i) ) ){
                
                char ch = map.get(s.charAt(i) ) ;
                if(ch != t.charAt(i) ){
                    return false ;
                }else{
                    continue ; 
                }
                
            }else{
                
                if( map2.containsKey(t.charAt(i) ) == true  ){
                    
                    
                    return false; 
                    
                }else{
                    map2.put(t.charAt(i) , true ) ; 
                    map.put(s.charAt(i) , t.charAt(i) ) ; 
                }
                
            }
        
        
        }
        
        return true ; 
    }
}