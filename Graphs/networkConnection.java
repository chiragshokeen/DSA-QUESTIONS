//gcc aplication

class Solution {
    public int makeConnected(int n, int[][] connections) {
        
        //count connected components
        
        int noOfCables = connections.length ; 
        
        if( noOfCables < n-1 ) return -1;  //minimum condition
        
        boolean[] vis = new boolean[n] ;
        
        int count = 0 ; 
        
        ArrayList<Integer>[] graph = new ArrayList[n] ;
        
        for( int i = 0 ; i < graph.length ; i++ ){
            
           graph[i] = new ArrayList<>() ;
            
        }
        
        for( int i = 0 ; i < connections.length ; i++ ){
            
            graph[connections[i][0] ].add( connections[i][1] );
            graph[connections[i][1] ].add( connections[i][0] );
            
        }
        
        for( int i = 0 ; i < n ; i++ ){
            
            count+=dfs( i , graph , vis ) ;
            
        }
        return count-1 ; 
        
    }
    
    public int dfs( int u , ArrayList<Integer>[] graph , boolean[] vis ){
        
        if( vis[u] == true ) return 0 ; 
        vis[u] = true ; 
        for( int v : graph[u] ){
            dfs(v  , graph , vis) ; 
        }
        
        return 1;
    }
    
}