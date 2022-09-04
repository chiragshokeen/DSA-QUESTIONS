class Tree 
{
    //Function to serialize a tree and return a list containing nodes of tree.
    static final int Empty=-1;
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    if( root == null ){
	        A.add(Empty) ;
	        return ;
	    }
	    
	     A.add( root.data ) ;
	   
	    serialize( root.left , A ) ;
	    serialize(root.right , A) ; 
	    
	    
	}
	
	//Function to deserialize a list and construct the tree.
	
	
	public int idx = 0 ; 
	
    public Node deSerialize(ArrayList<Integer> list)
    {
        
        if(  idx == list.size() || list.get(idx) == -1 ){
            idx++ ; 
            return null ; 
        }
        
        Node node=  new Node(list.get(idx++)) ;
        node.left =  deSerialize(list) ;
        node.right =  deSerialize(list) ;
        
        return node;
        
        
    }
};