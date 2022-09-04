class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        
        ArrayList<Integer>[] graph = new ArrayList[n] ;
        
        for( int i = 0 ; i < n ; i++ ){
            graph[i] = new ArrayList<>() ; 
        }
        
        
        for( int i = 0 ; i < n ; i++ ){
            for( int j = 0 ; j < n ; j++ ){
                
                if( i != j && isConnected[i][j]==1 ){
                    graph[i].add(j);
                }
                
            }
        }
        
        int count = 0 ; 
        boolean[] vis = new boolean[n] ;
        for( int i = 0 ; i < n ;i++  ){
            if( !vis[i] ){
                dfs( graph , vis , i ) ;
                count++;
            }
        }
        
        return count;
        
    }
    
    
    public void dfs( ArrayList<Integer>[] graph , boolean[] vis , int src ){
        vis[src] = true;
        for( int ele : graph[src] ){
            if(!vis[ele]){
                dfs(graph , vis , ele);
            }
        }
    }
    
}