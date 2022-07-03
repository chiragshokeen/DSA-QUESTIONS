
class Solution
{
    
	ArrayList <Integer> printBoundary(Node node)
	{
	    
	    ArrayList<Integer> ans = new ArrayList<>() ;
	    ans.add(node.data) ; 
	    Left(node.left , ans ) ;
	    leaf(node,ans ) ; 
	    right(node.right , ans) ; 
	    
	    return ans;
	    
	    
	    
	}
	
	public void Left(Node node , ArrayList<Integer> ans){
	    if(node == null ) return;
	    
	    if(node.left!=null ){
	        ans.add(node.data) ;
	        Left(node.left , ans) ; 
	    }else if(node.right!=null ){
	        
	        ans.add(node.data) ;
	        Left(node.right , ans) ; 
	        
	    }
	    
	}
	
	public void leaf(Node node , ArrayList<Integer> ans ){
	    
	    if(node == null  ) return ;
	    
	    leaf(node.left,ans ) ;
	    if(node.left == null && node.right == null ){
	        ans.add(node.data) ; 
	    }
	    leaf(node.right , ans) ; 
	    
	}
	
	public void right(Node node , ArrayList<Integer> ans ){
	    if(node == null ) return;
	    
	    if(node.right!=null ){
	       right(node.right , ans) ; 
	        ans.add(node.data) ;
	        
	    }else if(node.left!=null ){
	          right(node.left , ans) ;
	        ans.add(node.data) ;
	       
	        
	    }
	    
	    
	}
	
	
}