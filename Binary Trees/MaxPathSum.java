/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxPathSum(TreeNode root) {
        
        if(root == null) return 0 ; 
        
        maxPathSum_(root) ; 
        
        return maxNTN ; 
        
    }
    
    
      int maxNTN = -(int)1e9 ; 
      public int maxPathSum_(TreeNode root) {
        
          if(root == null) return 0 ;
          
          int leftnodetoroot = maxPathSum_(root.left) ;
          int rightnodetoroot = maxPathSum_(root.right) ; 
          
          int maxsumnodetoroot = Math.max(leftnodetoroot , rightnodetoroot) + root.val ; 
        
          
                                     //compare 4 cases to store ans          
          maxNTN = Math.max(Math.max(maxNTN , maxsumnodetoroot) , Math.max(root.val , leftnodetoroot+rightnodetoroot + root.val)  ) ; 
          
          return Math.max(maxsumnodetoroot , root.val) ; 
          
        
    }
}