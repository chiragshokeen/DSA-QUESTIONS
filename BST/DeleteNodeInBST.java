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
    public TreeNode deleteNode(TreeNode root, int key) {
        
        
        if(root == null) return null ; 
        
        if(root.val > key ){
            
            root.left = deleteNode(root.left ,key) ; 
            
            
        }else if(root.val < key){
            root.right = deleteNode(root.right , key) ;
        }else{
            
            
            if(root.left == null || root.right == null ){
                return root.left!=null ? root.left : root.right ; 
            }
            
            int maxvalue = maximumEle(root.left ) ;
            root.val = maxvalue ;
            
            root.left = deleteNode(root.left , maxvalue);
            
            
        }
        
        return root;
        
        
        
    }
    public int maximumEle(TreeNode root){
        
        
        //if(root == null) return null ; 
        
        TreeNode curr = root;
        while(curr.right!=null){
            curr = curr.right;
        }
        return curr.val;
        
    }
}