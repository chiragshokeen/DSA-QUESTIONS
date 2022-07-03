//leetcode 101

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
    public boolean isSymmetric(TreeNode root) {
        
        boolean ans = isMirror(root , root ) ;
        return ans ; 
        
    }
    
    public boolean isMirror(TreeNode root1 , TreeNode root2 ){
        
        if(root1 == null && root2 == null ) return true ;
        if(root1 == null || root2 == null ) return false;
        
        
        boolean lans = isMirror( root1.left , root2.right ) ;
        boolean rans = isMirror(root1.right , root2.left ) ;
        
        if(lans && rans && root1.val == root2.val ){
            return true ; 
        }
        return false;
    }
    
}
