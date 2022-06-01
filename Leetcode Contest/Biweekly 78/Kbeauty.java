class Solution {
    public int divisorSubstrings(int num, int k) {
        
        String s = String.valueOf(num) ;
        int count = 0 ; 
        for( int i = 0 ; i +k <= s.length() ; i++ ){
            
            
            String sub = s.substring( i , i + k ) ;
            if( Integer.valueOf(sub) == 0  ){
                continue;
            }
            if( num % Integer.valueOf(sub) == 0   ){
                count++ ;
            }
            
            
            
        }
        
        return count;
    }
}