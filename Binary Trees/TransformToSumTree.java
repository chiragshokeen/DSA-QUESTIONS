
class Solution{
    public void toSumTree(Node root){
         if(root == null) return ;
          toSumTree_(root) ; 
          return;
    }
    
    public int toSumTree_( Node node ){
        
        if( node == null ){
            return 0 ; 
        }
        
        int val = 0 ; 
        val+=(toSumTree_(node.left) + toSumTree_( node.right ) ) ;
        int rval = val + node.data ; 
        node.data = val ; 
        return rval ; 
        
        
        
    }
    
}
