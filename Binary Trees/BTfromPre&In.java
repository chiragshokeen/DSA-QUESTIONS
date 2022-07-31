class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode node = new TreeNode();
        node = InOrderPreOrder(preorder , 0 , preorder.length - 1 , inorder , 0 , inorder.length - 1 ) ;
        return node;
    }
     
    public TreeNode InOrderPreOrder(int[] preorder , int psi , int pei , int[] inorder , int isi , int  iei){
        
        if(psi > pei ) return null ; 
        
        TreeNode node = new TreeNode(preorder[psi] );
        
        int idx = 0;
        while(inorder[idx] != preorder[psi] ){
            idx++ ; 
        }
        int tnel = idx - isi ; 
        
        node.left = InOrderPreOrder(preorder , psi + 1 , psi + tnel , inorder ,isi , idx - 1   ) ;
        node.right = InOrderPreOrder(preorder , psi + tnel + 1 , pei , inorder , idx+1 , iei) ;
        
        return node ; 
        
        
    }
}