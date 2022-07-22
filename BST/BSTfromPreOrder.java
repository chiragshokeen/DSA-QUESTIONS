class Solution {
    
    int idx = 0 ; //global bcoz we dnt need to decrease with backtracking
  
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode root = new TreeNode() ;
        
        root = makebst(preorder , -(int)1e9 , (int)1e9 ) ;
        
        return root;
        }
    
    public TreeNode makebst(int[] arr , int lr , int rr){
        
       if(idx == arr.length || arr[idx] < lr || arr[idx] > rr ){
           return null ;
       }
            
        TreeNode node = new TreeNode(arr[idx++] ) ;
      
        node.left = makebst(arr , lr , node.val ) ;
        node.right = makebst(arr , node.val , rr) ;
        
        return node ; 
        
        
    }
    
}