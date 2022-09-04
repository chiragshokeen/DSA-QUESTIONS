class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node prev ; 
    Node bToDLL(Node root)
    {
        
        Node dummy = new Node(-1) ;
         prev = dummy; 
        
        bToDLL_( root ) ; 
        Node head = dummy.right ; 
        head.left = null ; 
        dummy.right =  null ; 
        return  head;
        
        
    }
    
    public void bToDLL_( Node node ){
        
         if(node == null) return ;
        bToDLL_( node.left ) ; 
        
        prev.right = node;
        node.left = prev ; 
        prev = node ; 
        
        bToDLL_( node.right ); 
        
        
    }
    
    
    
}