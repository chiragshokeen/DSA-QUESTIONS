//leetcode 112
// Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

// A leaf is a node with no children.

 

class solution{

    public static boolean pathSum( TreeNode node , int targetSum ){

        if( node == null  ){
            return false;
        }

        if( node.left == null && node.right == null && targetSum-node.val == 0  ){ //checking if leaf or not
            return true ; 
        }

        
        return pathSum(node.left, targetSum-node.val) || pathSum( node.right , targetSum-node.val ) ; 




    }



}