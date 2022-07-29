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
    
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if( root == null ){
            return subRoot == null ; 
        }
        
        return isIdentical( root , subRoot ) || isSubtree( root.left , subRoot ) || isSubtree(root.right , subRoot)  ;
         
        
    }
    
    public boolean isIdentical( TreeNode r , TreeNode sr ){
        
        if( r == null && sr == null ) return true;
        if( r == null || sr == null ) return false;
        
        
    if( r.val != sr.val){
        return false;
    }
        return isIdentical( r.left , sr.left ) && isIdentical( r.right , sr.right ) ; 
        
        
    }
    
}