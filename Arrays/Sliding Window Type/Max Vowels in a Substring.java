//leetcode 1456
//input : aebidouaaiec , 4
//output : 4

class Solution {
    public int maxVowels(String s, int k) {
        
        
        int n = s.length() ;
        
        //int count = k ;
        int ans = 0 , maxans = 0;
        int si = 0 , ei =0 ; 
        
        while(ei < n){
            
            if(isvowel(s.charAt(ei++) ) ){
                ans++ ;
               // count-- ;
            }
            
            if(ei-si == k ){
                maxans = Math.max(ans , maxans) ;
                if(isvowel(s.charAt(si++))  ){
                    ans-- ;
                   // count++ ;
                }
            }
            
        }
        return maxans ;
        
    }
    
    public boolean isvowel(char ch){
        
        return ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ;
        
    }
}