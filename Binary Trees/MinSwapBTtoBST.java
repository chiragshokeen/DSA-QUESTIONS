class Solution {
    
    public static class Pair implements Comparable<Pair>{
        
        int val ; 
        int idx ; 
        
        Pair( int val , int idx ){
            this.val = val ; 
            this.idx = idx ; 
        }
        
        public int compareTo( Pair o  ){
            return this.val - o.val ; 
        }
        
    }
    
    public static void inorder_fill( ArrayList<Integer> inorder , int idx , int[] pre , int n ){
        
        
        if( idx >= n   ){
            return ; 
        }
        
        inorder_fill( inorder , 2*idx +1 , pre , n  ) ;
        
        inorder.add( pre[idx] ) ; 
        
        inorder_fill( inorder , 2*idx +2 , pre , n   ) ; 
        
        
    }
    public static int minSwaps(int n, int[] A) {
        
        ArrayList<Integer> in = new ArrayList<>() ;
        
        inorder_fill( in , 0  , A , n  ) ;
        
        int[] inorder = new int[n] ;
        for(int i = 0 ; i < n ;i++){
            inorder[i] = in.get(i) ;
        }
     
        Pair[] arr = new Pair[n] ;
        for( int i = 0 ; i < n ; i++ ){
            arr[i] = new Pair( inorder[i] , i  ) ; 
        }
        Arrays.sort(arr);
        
      
            
        int ans = 0 ;  
        boolean[] vis = new boolean[n] ;
        
        for(int i = 0 ; i < n ; i++  ){
            
            if( vis[i] == true || arr[i].idx == i ){
                continue ; 
            } 
            
            int j = i ; 
            int clen = 0 ; 
            while( vis[j] == false ){
                vis[j] = true ; 
                clen++ ; 
                j = arr[j].idx ; 
            }
            
            ans+=(clen-1) ;
        }
        
        return ans ;
    }
}