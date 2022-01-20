//leetcode 113
// Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths
// where the sum of the node values in the path equals targetSum.
// Each path should be returned as a list of the node values, not node references.
// A root-to-leaf path is a path starting from the root and ending at any leaf node.
// A leaf is a node with no children.


class Solution {
   
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
       List<List<Integer>> res = new ArrayList<>();
        
        
        pathSum(root , targetSum ,res, new ArrayList<Integer>() ) ; 
        return res;
    }
    
    
      public void pathSum(TreeNode root, int targetSum,List<List<Integer>> res,ArrayList<Integer> myAns) {
        
         if(root == null ) return ; 
         
         if(root.left == null && root.right == null ){ //leaf node check
             if(targetSum - root.val == 0  ){
                 
                 ArrayList<Integer> base = new ArrayList<>(myAns) ; //making a copy of the answers
                 base.add(root.val) ;
                 res.add(base) ;
                 
             }
             return;
         }
         
         myAns.add(root.val) ;
         pathSum(root.left , targetSum - root.val ,res, myAns); //left call
         pathSum(root.right , targetSum - root.val ,res, myAns); //right call
         myAns.remove(myAns.size()-1) ;    
         
    }
}