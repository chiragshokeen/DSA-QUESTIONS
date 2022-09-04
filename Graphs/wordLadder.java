class Solution {
    public int ladderLength(String start, String end, List<String> wordList) {
        
        if( start.equals(end) ) return 0 ; 
        
        Set<String> bank = new HashSet<>() ;
        for(String s : wordList ){
            bank.add(s);
        }
        
        if( !bank.contains(end)) return 0 ; 
        
        
        HashMap<Character,Integer> charset = new HashMap<>() ;
        for( String s : wordList ){
            
           for(int i = 0 ; i < s.length() ; i++ ){
               char ch = s.charAt(i) ;
               charset.putIfAbsent(ch , 1 ) ; 
           }
            
        }
         ArrayList<Character> chars = new ArrayList<>() ;
        for( char key : charset.keySet() ){
            chars.add(key) ;
        }
       
        
      int level = 0 ;
     Set<String> vis = new HashSet<>() ;
        LinkedList<String> que = new LinkedList<>() ;
        
        vis.add(start) ;
        que.addLast(start ) ; 
        
        while( que.size() != 0  ){
            
            int size = que.size() ;
            
            while(size-- > 0 ){
                
                String rem = que.removeFirst() ;
                
                if(rem.equals(end)) return level+1 ; 
                
                char[] arr = rem.toCharArray() ;
                
                for( int i = 0 ; i < arr.length ; i++ ){
                    
                    char old = arr[i] ;
                    
                    for( char c : chars ){
                        arr[i] = c ;
                       
                        String next = new String(arr) ;
                        
                        if(!vis.contains(next) && bank.contains(next) ){
                            que.addLast(next) ;
                            vis.add(next); 
                        }
                    }
                      arr[i] = old ;
                      
                }
              
            }
            
            
            
            
            level++ ; 
            
        }
     
        
        return 0 ; 
    }
}