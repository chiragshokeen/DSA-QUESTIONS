class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        
        HashMap<String , Integer> map = new HashMap<>() ;
        int n = senders.length ;
        
        for( int i = 0 ; i < n ; i++ ){
            String str = messages[i];
            String[] words = str.split("\\s+");
            int len = words.length ; 
            
            map.put( senders[i] , map.getOrDefault(senders[i] , 0 ) + len ) ; 
           
        }
        
        int max = -(int)1e9;
        String ans ="" ;
        for(String key : map.keySet()){
            
            if( map.get(key) > max ){
                max = map.get(key);
                ans = key;
            }else if( map.get(key) == max ){
                
                String s1 = key ;
                String s2 = ans;
                
                int val = s1.compareTo(s2);
                if(val >= 0 ){
                    ans = s1;
                }else{
                    ans=s2;
                }
                
            }
            
            
        }
        
        
        
        return  ans ;
        
    }
}