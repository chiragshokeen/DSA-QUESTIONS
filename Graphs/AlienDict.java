class Solution
{
      public String ans = "" ;
    public String findOrder(String [] dict, int N, int K)
    {
        
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>() ;
        
        for( int i = 0 ; i < K ; i++ ){
            graph.add( new ArrayList<>() ) ; 
        }
        
        for( int i = 0 ; i < N-1 ; i++ ){
            
            String s1 = dict[i] ;
            String s2 = dict[i+1] ; 
            
            for( int j = 0 ; j < Math.min( s1.length() , s2.length() ) ; j++ ){
                
                if( s1.charAt(j) != s2.charAt(j) ){
                    
                    graph.get( s1.charAt(j)-'a' ).add( s2.charAt(j)-'a' ) ; 
                    break;
                    
                }
                
                
            }
        }
            
          
            boolean[] vis = new boolean[K] ; 
            for( int i = 0 ; i < K ; i++ ){
                
                if( !vis[i] ){
                    dfs( graph , vis ,  i  ) ;
                }
                
                
            }
        //    System.out.print(ans) ;
            char[] arr = ans.toCharArray() ;
            int si = 0 ; 
            int ei = arr.length - 1 ; 
            while( si<ei ){
                char temp = arr[si] ;
                arr[si] = arr[ei] ;
                arr[ei] = temp;
                si++ ; 
                ei--;
            }
            String str =  String.valueOf(arr);
        //   System.out.print(str) ;
            return str ; 
            
            
            
        
        
    }
    
    public String dfs( ArrayList<ArrayList<Integer>> graph , boolean[] vis , int src ){
        
        vis[src] = true ;
        
        for( int v : graph.get(src) ){
            if( !vis[v] ){
                dfs( graph , vis  , v ) ;
            }
        }
        
        char ch = (char)(src + 'a') ;
        ans =  ans + ch ;
     //   System.out.println(ans) ;
        
        return ans ; 
        
    }
    
}