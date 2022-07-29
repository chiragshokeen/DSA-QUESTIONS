class Solution
{
    int ans = -1; 
    boolean check(Node root)
    {
	    
	    if(root == null) return true ; 
	   
	    return check_( root , 0 );
	    
    }
    
    
    public boolean check_( Node node , int level ){
        
        if( node == null  ) return true;
        
        if( node.left == null && node.right == null ){
            if( ans == -1 ){
                ans = level ; 
                return true ; 
            }
           else if( ans != level ){
                 return false;
            }else{
                return true;
            }
        }
        
        return check_(node.left  , level+1  ) && check_( node.right , level+1 ) ; 
        
        
    }
    
    
    
    
}