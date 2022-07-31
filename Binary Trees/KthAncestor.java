class Tree
{
    int ans = -1;
    boolean flag = false;
    int K = 0 ; 
    public int kthAncestor(Node root, int k, int node)
    {
        K = k ; 
        kthAncestor_( root , k , node ) ;
        return ans ; 
    }
    
    
    public boolean kthAncestor_( Node node  , int k , int val){
        
        if( node == null ) return false;
        
        if(ans != -1) return true;
        
        if( node.data == val  ){
            flag = true ;
            return true ; 
            
        }
        
        
        boolean left =  kthAncestor_( node.left , k , val ) ;
        boolean right =  kthAncestor_( node.right , k , val );
        
        if( left || right){
            
       
               K-- ; 
               if( K == 0 ){
                    ans = node.data ; 
                    return true ;
             
          }
        
       
            return true;
            
        }
        
         return false ; 
        
    }
    
    
}