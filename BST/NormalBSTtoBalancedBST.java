class GfG
{
    Node buildBalancedTree(Node root) 
    {
        ArrayList<Integer> list = new ArrayList<>() ;
        fillArr( root , list ) ;  
        
        int[] arr = new int[list.size()] ;
        for( int i = 0 ; i < list.size() ; i++ ){
            arr[i] = list.get(i) ;
        }
        Node ans = sortedArrToBST(  arr , 0 , arr.length -1 ) ; 
        return ans ; 
        
    }
    
    public Node sortedArrToBST( int[] arr , int si , int ei ){
        
        
        if( si >ei ){
           return null ; 
        }
         
        int mid = (si + ei)/2 ; 
        Node node = new Node( arr[mid] ) ;
        node.left = sortedArrToBST( arr , si , mid-1  ) ;
        node.right = sortedArrToBST( arr , mid+1 , ei ) ;
        
        return node;
        
    }
    
    public void fillArr( Node node , ArrayList<Integer> arr ){
        if(node == null) return ; 
        
        fillArr(node.left , arr) ;
        arr.add(node.data) ; 
        fillArr(node.right , arr) ; 
    }
}
