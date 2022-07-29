//O(n^2)

class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	
        	int lh = 0 ;
        	int rh = 0 ; 
        	
        	if( root == null ) return true ;
	
	        lh = height(root.left) ;
	        rh = height(root.right ) ; 
	
	        boolean lans = isBalanced( root.left ) ;
	        boolean rans = isBalanced( root.right ) ;
	        
	        if( Math.abs( lh-rh ) <= 1  && lans && rans){
	            return true ; 
	        }
	
	        return false;
	
    }
    
    public int height( Node node ){
        if( node == null ) return 0 ;
        
        return Math.max( height(node.left) , height(node.right ) ) + 1 ; 
    }
    
}


//O(n)

class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	
        return (height(root) != -1) ; 
	
    }
    
    public int height( Node node ){
        
        if(node == null ) return 0 ; 
        
        
        int lh = height( node.left ) ;
        int rh= height( node.right ) ;
        if( lh == -1 || rh == -1 ) return -1;
        if( Math.abs( lh-rh ) > 1 ){
            return -1;
        }
        
        return ( Math.max( lh , rh) + 1 ) ;
        
        
    }
   
    
}
