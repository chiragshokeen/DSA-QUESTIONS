class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
    
        
        String text1 = pattern.charAt(0)+ text ;
        String text2 = text + pattern.charAt(1) ;
        
        int newl = text1.length() ;
        
        long count = 0 ; 
        long ans1 = 0 ; 
        
        for( int i = 0 ; i < newl ; i++ ){
            
            char ch = text1.charAt(i) ;
            
            if( ch == pattern.charAt(0)){
                count+=1;
                
            }
            else if(ch == pattern.charAt(1) ){
                ans1+=count;
            }
            
        }
        //edge case when both equal in pattern
        
        if(pattern.charAt(0) == pattern.charAt(1) ){
            return count * (count-1)/2 ; 
        }
        
        count = 0 ; 
        long ans2 = 0 ; 
          for( int i = 0 ; i < newl ; i++ ){
            
            char ch = text2.charAt(i) ;
            
            if( ch == pattern.charAt(0) ){
                count+=1;
                 
            }
           else if(ch == pattern.charAt(1)){
                ans2+=count;
            }
            
        }
        
        //edge case when both equal in pattern
        if(pattern.charAt(0) == pattern.charAt(1) ){
            return count * (count-1)/2 ; 
        }
        
        return Math.max(ans1  , ans2) ; 
        
        
    }
}