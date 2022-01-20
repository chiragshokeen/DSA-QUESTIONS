// leetcode 437

// Given the root of a binary tree and an integer targetSum,
// return the number of paths where the sum of the values along the path equals targetSum.

// The path does not need to start or end at the root or a leaf
// , but it must go downwards (i.e., traveling only from parent nodes to child nodes).

class Solution {
    int count = 0 ; 
    public int pathSum(TreeNode root, int sum) {
        
         if (root == null) return 0;

        pathSumHelper(root, sum, 0);
        pathSum(root.left, sum);
        pathSum(root.right, sum);

        return count;
    }
    
 
   void pathSumHelper(TreeNode root, int sum, int currentSum) {
        if (root == null) {
            return;
        }
        currentSum += root.val;
        if (currentSum == sum) {
            count++;
        }
        pathSumHelper(root.left, sum, currentSum);
        pathSumHelper(root.right, sum, currentSum);
    } 
}