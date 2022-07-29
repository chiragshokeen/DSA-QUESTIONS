//PrimsApplication

class Solution {
    
    class Pair{
        int vtx = 0;
        int par = 0;
        int wt = 0;
        
        Pair( int vtx , int par , int wt ){
            this.vtx = vtx ; 
            this.par = par ; 
            this.wt = wt ;
        }
    }
    class Edge{
        
        int v ;
        int w ; 
        
        Edge(int v , int w){
            this.v = v ;
            this.w = w ;
        }   
}
    public int minCostConnectPoints(int[][] points) {
        
          int n = points.length, cost = 0;
        
        // Construct adjacency matrix
        //connecting all to all then we will apply prims
        int[][] adj = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                adj[i][j] = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                adj[j][i] = adj[i][j];
            }
        }
        
        ArrayList<Edge>[] graph = new ArrayList[n] ;
        for(int i = 0 ; i < n ; i++){
            graph[i] = new ArrayList<>() ;
        }
        
        for( int i = 0 ; i < n ; i++ ){
            for( int j = i+1 ; j < n ;j++ ){
                graph[i].add( new Edge( j , adj[i][j] ) ) ;
                graph[j].add( new Edge( i , adj[i][j] ) ) ; 
            }
        }
        
        PriorityQueue<Pair> pq  =new PriorityQueue<>( (a,b) ->{
            return a.wt-b.wt ;
        }   ) ; 
        
        pq.add( new Pair(0 , -1 , 0 )) ;
        int NumberOfEdges = 0;
        boolean[] vis = new boolean[n] ;
        int sum = 0 ; 
        
        while( pq.size() > 0  && NumberOfEdges < n-1 ){
            
            Pair rem = pq.remove() ;
            if( vis[rem.vtx] == true ){
                continue ; 
            }
            
            if( rem.par != -1 ){
                sum+=rem.wt ;
                NumberOfEdges++ ; 
            }
            
            vis[rem.vtx] = true ;
            
            for( Edge e : graph[rem.vtx] ){
                
                if( !vis[e.v] ){
                    pq.add( new Pair(e.v , rem.vtx , e.w) ) ; 
                }
                
            }
            
        }
        
        return sum ; 
    }
}