class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>( ) ;
        
        LinkedList<Integer> que = new LinkedList<>() ;
        
        Deque<Integer> dq = new LinkedList<>() ;
        
        que.addLast(node.data) ;
        
        while(que.size() > 0 ){
            
            int size = que.size() ;
            while( size-- > 0 ){
                int rem = que.removeFirst() ;
                dq.addFirst(rem);
                
                if( node.right != null) que.add(node.right.data) ;
                if(node.left != null) que.add(node.left.data) ;
                
            }
            
        }
        
        while( dq.size() > 0 ){
            ans.add(dq.pop()) ;
        }
        
        return ans ; 
        
    }
}    