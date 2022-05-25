class Solution {
    public int countPrefixes(String[] words, String s) {
        
        HashMap<String , Integer> map = new HashMap<>() ;
        
        for( int i = 0 ; i < s.length() ; i++ ){
            
            String str = s.substring(0 , i+1) ; 
            map.put( str , map.getOrDefault(str , 0) + 1 ) ;
            
        }
        
        int count = 0 ; 
        for(int i = 0 ; i < words.length ; i++ ){
            if( map.containsKey(words[i]) ){
                count++ ; 
            }
        }
        
        return count;
        
    }
}