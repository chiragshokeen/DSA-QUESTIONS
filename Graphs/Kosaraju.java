class Solution
{
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer>[] graph = new ArrayList[V] ; 
        for( int i = 0 ; i  < V ; i++ ){
            graph[i] = new ArrayList<>() ;
        }
        
        for( int i = 0 ; i < adj.size() ; i++ ){
            
            for( int ele : adj.get(i) ){
               graph[i].add(ele);
            }
      
         
         
        }
        
      //  topological order
        Stack<Integer> st = new Stack<>() ;
        boolean[] vis = new boolean[V] ; 
        for( int i = 0 ;i < V ; i++ ){
            
            if( !vis[i] ){
                 dfs_topo(i , st , graph , vis  );
            }
            
        }
       
        
        //reverseEdgesOfGraph
        graph = new ArrayList[V] ; 
          for( int i = 0 ; i  < V ; i++ ){
            graph[i] = new ArrayList<>() ;
        }
        
         for( int i = 0 ; i < adj.size() ; i++ ){
            
              for( int ele : adj.get(i) ){
               graph[ele].add(i);
            }
            
         
         
        }
        
        Arrays.fill( vis , false ) ; 
        
      //  System.out.print(st.size()) ;
        List<List<Integer>> list  = new ArrayList<>() ;
        int count = 0 ; 
        while( st.size() > 0 ){
            int i = st.pop() ;
            if( !vis[i] ){
                dfs_SCC( graph , i , vis  ) ; 
                count++ ;
            }
        }
        
        return count ; 
        
        
        
    }
    
    public void dfs_SCC( ArrayList<Integer>[] graph , int src , boolean[] vis){
        
        vis[src] = true;
        for( int ele : graph[src] ){
            if(!vis[ele]){
                dfs_SCC( graph , ele , vis ) ; 
            }
        }
        
        return ; 
        
    }
    
    public void dfs_topo( int src , Stack<Integer> st , ArrayList<Integer>[] graph , boolean[] vis ){
        
        vis[src] = true;
        
        for( int ele : graph[src]  ){
            
            if( !vis[ele] ){
                dfs_topo( ele , st , graph , vis ) ;
            }
            
        }
        
        st.push(src) ;
        return;
        
    }
    
}