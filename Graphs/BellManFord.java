
class Solution
{
    public int isNegativeWeightCycle(int n, int[][] edges)
    {
        // int n = edges.length ;
        // int m = edges[0].length ; 
        int[] dist = new int[n] ;
        Arrays.fill( dist , (int)1e8) ; 
        dist[0] = 0 ; 
        for( int i = 0 ; i < n-1 ; i++ ){
            
            for( int[] p : edges ){
                
            int u = p[0];
            int v =p[1] ;
            int wt = p[2] ;
            
            if( dist[u] != (int)1e8 &&  dist[u] + wt < dist[v]  ){
                dist[v] = dist[u] + wt ; 
            }
                
        }
           
            
            
        }
        
        boolean flag = false;
        
        for( int j = 0 ; j < edges.length ; j++ ){
                
            int u = edges[j][0] ;
            int v = edges[j][1] ;
            int wt = edges[j][2] ;
            
            if( dist[u] != (int)1e9 &&  dist[u] + wt < dist[v]  ){
                return 1;
            }
                
        }
        return 0 ; 
    }
}