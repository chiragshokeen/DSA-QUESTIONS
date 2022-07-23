class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        
        //kahns algo
        //or color DFS
    
    // @SuppressWarnings("unchecked")
    //     ArrayList<Integer>[] graph = new ArrayList[V] ;
    //     for( int i = 0 ; i < V ; i++ ){
    //         graph[i] = new ArrayList<>() ;
            
    //     }
        
    //     for( int i = 0 ; i < V ; i++ ){
    //         for( int j = 0 ; j < adj.get(i).size() ; j++ ){
    //             graph[i].add( adj.get(i).get(j) );
    //         }
    //     }
        
        int[] vis = new int[V] ;
        Arrays.fill( vis , -1 ) ;
        boolean res = false;
        
        for( int i = 0 ; i < V ; i++ ){
            
            if( vis[i] == -1 ){
               res = res ||  dfsColor( adj , vis , i  ) ; 
            }
            
        }
        
        return res ; 
        
    }
    
    public boolean dfsColor( ArrayList<ArrayList<Integer>> graph , int[] vis , int u ){
        
     
        vis[u] = 0 ; 
        
        for( int v : graph.get( u ) ){
            if( vis[v] == 0 ){
                return true ; 
            }
            if( vis[v] == -1 && dfsColor( graph , vis , v ) == true ){
                return true;
            }
        }
        vis[u] = 1;
        return false;
    }
    
}