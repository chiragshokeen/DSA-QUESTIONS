class Solution {
    public boolean digitCount(String num) {
        
        int n = num.length() ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        
        for( int i = 0 ; i < n ; i++ ){
            char ch = num.charAt(i) ;
            
            int val = ch-'0' ; 
            map.put( val , map.getOrDefault( val , 0  ) + 1 ) ;
            
        }
        
        
        
        
        for( int i = 0 ; i < n ; i++ ){
            
            char ch1 = num.charAt(i) ;
            int ele = ch1-'0' ;
            if(map.containsKey(i) == false  ){
                map.put( i , 0  ) ; 
                
            }
            
           if( ele != map.get(i) ){
                return false;
            }
            
            
        }
        
        return true;
        
    }
}