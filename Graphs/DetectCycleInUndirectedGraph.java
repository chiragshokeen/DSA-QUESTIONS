class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        //using bfs
        
       
        
        boolean[] vis = new boolean[V] ;
        boolean res = false;
        for( int i = 0 ; i < V ; i++ ){
            if( vis[i] == false ){
                 res = res || helper( i , adj , vis ) ;
            }
           
            
        }
        return res;
        
        
    }
    
    public boolean helper(int src , ArrayList<ArrayList<Integer>> adj , boolean[] vis  ){
        
         LinkedList<Integer> que = new LinkedList<>() ;
        que.addLast( src ) ; 
        
        while( que.size() !=  0 ){
            
            int size = que.size() ;
            
            while( size-- > 0 ){
                
                int remvtx = que.removeFirst() ;
                if( vis[ remvtx ] == true ){
                    //cycle is there
                    return true ; 
                }else{
                    vis[remvtx] = true ;
                }
                for( int i = 0 ; i < adj.get(remvtx).size() ; i++ ){
                    
                    if( vis[ adj.get(remvtx).get(i) ] == false ){
                        que.addLast(adj.get(remvtx).get(i)  ); 
                    }
                    
                }
                
                
                
                
            }
            
        }
        return false;
        
    }
}