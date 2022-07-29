class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
    class Pair{
        Node node ; 
        int level ; 
        
        Pair( Node node , int level ){
            this.node = node ; 
            this.level = level;
        }
    }
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    
	    LinkedList<Pair> que = new LinkedList<>() ;
	    que.addLast( new Pair(root, 0) ) ;
	    ArrayList<Integer> ans  = new ArrayList<>() ;
	    
	    int level = 0 ; 
	    
	    while( que.size() != 0  ){
	        
	        int size = que.size() ;
	        Stack<Pair> st = new Stack<>() ;
	        
	        while( size-- > 0  ){
	            
	            
	            Pair rem = que.removeFirst() ;
	            if( rem.level % 2 != 0  ){
	                st.push(rem);
	            }else{
	                ans.add(rem.node.data) ;
	            }
	            if( rem.node.left != null ){
	                 que.addLast( new Pair( rem.node.left  , rem.level + 1 ) ) ;
	            } 
	            if( rem.node.right != null ){
	                 que.addLast( new Pair( rem.node.right  , rem.level + 1 ) ) ;
	            }
	          
	            
	            
	            
	        }
	        
	        while( st.size() > 0 ){
	            ans.add(st.pop().node.data) ; 
	        }
	    }
	    
	    return ans ; 
	    
	}
}