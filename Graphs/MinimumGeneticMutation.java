//word ladder application

class Solution {
    public int minMutation(String start, String end, String[] bank) {
        
        if( start.equals(end) ) return 0 ; 
        
        Set<String> bankset = new HashSet<>() ;
        for(String s : bank ){
            bankset.add(s) ;
        }
        
        char[] charset = new char[]{ 'A' , 'C' , 'G' , 'T'} ; 
        
        LinkedList<String> que = new LinkedList<>() ;
        Set<String> vis = new HashSet<>() ;
        vis.add(start ) ; 
        que.addFirst(start ) ;
        
        int level = 0 ; 
        
        while( que.size() != 0  ){
            
            int size = que.size() ;
            
            while(size-- > 0  ){
                
            String rem = que.removeFirst() ;
                
            if(rem.equals(end ) ){
                return level ;
            }
            char[] arr = rem.toCharArray() ;
            
           for( int i = 0 ; i < arr.length ; i++ ){
               
               char old = arr[i] ;
               
               for( char c : charset ){
                   
                   arr[i] = c ; 
                   String next = new String(arr ) ; 
                   if(!vis.contains(next) && bankset.contains(next )  ){
                       que.addLast(next ) ;
                      vis.add(next) ;
                   }
                   
               }
               arr[i] = old ; 
               
           }
            
            
      
            
          }
           level++ ; 
        }
        
        return -1 ; 
        
    }
}