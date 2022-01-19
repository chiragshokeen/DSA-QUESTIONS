//leetcode 863

//combination of k distance down + root to node path

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        
         ArrayList<TreeNode> list = new ArrayList<>();
        nodetoRootPath(root, target, list);

        List<Integer> ans = new ArrayList<>();
        TreeNode blockNode = null;

        for (int i = 0; i < list.size(); i++) { 
                                             //depth //ans list
            printKDown(list.get(i), blockNode, K - i, ans);
            blockNode = list.get(i);
        }
        return ans;
        
        
    }
    
    public boolean nodetoRootPath(TreeNode node , TreeNode data , ArrayList<TreeNode> ans ){
        
        if(node == null ) return false;
        
        if(node== data ){
            ans.add(node);
            return true;
        }
        
        boolean res = nodetoRootPath( node.left , data , ans ) || nodetoRootPath(node.right ,                         data,ans) ;
        if(res){
            ans.add(node) ;
            
        }
      return res;
        
        
    }
    
  public void printKDown(TreeNode node, TreeNode block, int depth, List<Integer> ans) {
      
      if(node == null || depth < 0 || node == block ){
          return ;
      }
      
      if(depth == 0) {
          ans.add(node.val); 
          return ; 
      }
      
      printKDown(node.left , block , depth-1 , ans  ) ; 
      printKDown(node.right , block , depth-1 , ans) ; 
      
      
      return ;
      
      
  }
      
    
}