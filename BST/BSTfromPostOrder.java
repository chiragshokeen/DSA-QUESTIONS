public static int idx = 0 ; 
public static TreeNode bstFromPostorder(int[] postorder) {
    // if( postorder.length == 0 ){
    //     return null ; 
    // }
    int n = postorder.length ; 
    idx = n-1;
    TreeNode ans = bstFromPostOrder_( postorder,-(int)1e8  , (int)1e8);
    
    return ans ; 
    
    
}

public static TreeNode bstFromPostOrder_(  int[] arr,int l , int r ){
    
    if( idx == -1 || arr[idx] < l || arr[idx] > r ){
        return null ;
    }
    
    
    TreeNode node = new TreeNode( arr[idx--] ) ; 
    node.right = bstFromPostOrder_(  arr  , node.val , r ) ;
    node.left = bstFromPostOrder_( arr , l , node.val ) ; 
    
    return node;
    
}