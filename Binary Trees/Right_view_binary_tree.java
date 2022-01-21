//leetcode 199
// Given the root of a binary tree, imagine yourself standing on the right side of it, return the values 
// of the nodes you can see ordered from top to bottom.

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
    public List<Integer> rightSideView(TreeNode root) {
        
        if(root == null) return new ArrayList<>() ; 
        
        LinkedList<TreeNode> que = new LinkedList<>() ;
      
        List<Integer> ans = new ArrayList<>() ; 
        
        que.add(root ) ;
        
        while( que.size()!= 0  ){
            
            int size = que.size() ;
          
            for(int i = 0 ; i < size ; i++){
                
                TreeNode rem = que.removeFirst() ; 
                if( i == size-1 ) ans.add(rem.val) ; 
                if(rem.left!=null ){
                    que.addLast(rem.left) ; 
                }
                if(rem.right!=null ){
                    que.addLast(rem.right) ; 
                }
                
                
                
            }
        
            
        }
        

        return ans ; 
    }
}