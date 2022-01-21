//leetcode 543
// can be done by global variable
//basic solution
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null ) return 0 ; 
        
        int leftd =   diameterOfBinaryTree(root.left) ;
        int rightd =   diameterOfBinaryTree(root.right) ;
        
        int heightl = height(root.left) ;
        int heightr = height(root.right) ;
        
        return Math.max(Math.max(leftd , rightd ), heightl + heightr + 2 ) ;
        
    }
    
    public int height(TreeNode node){
        if(node == null  ){
            return -1 ; 
            
        }
        
        int lh = height( node.left) ;
        int rh = height(node.right ) ; 
        
        return Math.max(lh,rh ) + 1 ; 
        
    }
    
}

//returning pair
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null ) return 0 ; 
        
        int[] arr = diameterOfBinaryTree_02(root) ;
        return arr[0] ; 
    }
     public int[] diameterOfBinaryTree_02(TreeNode root) {
        if (root == null)
            return new int[] { -1, -1 };
        int[] leftAns = diameterOfBinaryTree_02(root.left);
        int[] rightAns = diameterOfBinaryTree_02(root.right);

        int[] ans = new int[2];
        ans[0] = Math.max(Math.max(leftAns[0], rightAns[0]), leftAns[1] + rightAns[1] + 2);
        ans[1] = Math.max(leftAns[1], rightAns[1]) + 1;

        return ans;
    }
    
}