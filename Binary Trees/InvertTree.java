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
    public TreeNode invertTree(TreeNode root) {
        if( root == null ) return null ; 
        
        invertTree_( root ) ;
        return root;
       
        
        
    }
    
    public void invertTree_( TreeNode node ){
        
        if( node == null ) return ; 
        
        TreeNode temp = node.left ;
        node.left = node.right ;
        node.right = temp ; 
        invertTree_( node.left );
        invertTree_( node.right ) ; 
        
    }
    
}