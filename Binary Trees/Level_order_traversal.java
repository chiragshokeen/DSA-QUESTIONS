//leetcode 102
// Input: root = [3,9,20,null,null,15,7]
// Output: [[3],[9,20],[15,7]]

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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
          if (root == null)
              return new ArrayList<>();
  
          LinkedList<TreeNode> que = new LinkedList<>();
          List<List<Integer>> ans = new ArrayList<>();
  
          que.addLast(root);
  
          int level = 0;
          while (que.size() != 0) {
              int size = que.size();
  
              while (size-- > 0) {
                  TreeNode rn = que.removeFirst(); // rn : remove Node
                  if (level == ans.size())
                      ans.add(new ArrayList<>());
                  ans.get(level).add(rn.val);
  
                  if (rn.left != null)
                      que.addLast(rn.left);
                  if (rn.right != null)
                      que.addLast(rn.right);
              }
  
              level++;
          }
  
          return ans;
      }
          
          
          
      
  }