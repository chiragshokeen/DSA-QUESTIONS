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
    public static void width(TreeNode root, int hl, int[] ans) {
     if (root == null)
         return;

     ans[0] = Math.min(hl, ans[0]);
     ans[1] = Math.max(hl, ans[1]);

     width(root.left, hl - 1, ans);
     width(root.right, hl + 1, ans);
 }
 public static class verticalPair2 {
     TreeNode node = null;
     int x = 0; // horizontal Level
     int y = 0; // vertical level

     verticalPair2(TreeNode node, int x, int y) {
         this.node = node;
         this.x = x;
         this.y = y;
     }
 }
 public List<List<Integer>> verticalTraversal(TreeNode root) {
     
          PriorityQueue<verticalPair2> que = new PriorityQueue<>((a, b) -> {
         if (a.y != b.y)
             return a.y - b.y;   // this - other for default behaviour
         else
             return a.node.val - b.node.val; // this - other for default behaviour
     });

     int[] minMax = new int[2];
     width(root, 0, minMax);
     int length = minMax[1] - minMax[0] + 1;
     List<List<Integer>> ans = new ArrayList<>();
     for (int i = 0; i < length; i++)
         ans.add(new ArrayList<>());

     que.add(new verticalPair2(root, -minMax[0], 0));

     while (que.size() != 0) {
         verticalPair2 rp = que.remove();

         ans.get(rp.x).add(rp.node.val);

         if (rp.node.left != null)
             que.add(new verticalPair2(rp.node.left, rp.x - 1, rp.y + 1));

         if (rp.node.right != null)
             que.add(new verticalPair2(rp.node.right, rp.x + 1, rp.y + 1));

     }

     return ans;
     
 }
}