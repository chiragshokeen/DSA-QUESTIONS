//leetcode 236

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        
        List<TreeNode> l1 = nodeToRootPath(root , p.val) ;
        List<TreeNode> l2 = nodeToRootPath(root , q.val) ;
        
        TreeNode ans = null ; 
        
        int i = l1.size() -1 ; 
        int j = l2.size() -1  ;
        
        while(i >= 0 && j >= 0  ){
            
            if( l1.get(i).val != l2.get(j).val ){
               break ; 
            }
             ans = l1.get(i) ;
                i-- ; 
                j-- ; 
            
            
        }
        
        return ans ; 
        
    }
    
    public List<TreeNode> nodeToRootPath( TreeNode root , int tar){
        
        if( root == null ){
            return new ArrayList<>() ; 
        }
        
        if( root.val == tar ){
            List<TreeNode> base = new ArrayList<>() ;
            base.add(root) ;
            return base ; 
        }
        
        
        List<TreeNode> left = nodeToRootPath(root.left , tar) ;
        if(left.size() > 0){
            left.add(root) ; 
            return left ;
        }
        
        List<TreeNode> right = nodeToRootPath(root.right , tar) ;
        if( right.size() > 0  ){
            right.add(root) ; 
            return right ; 
        }
        
        
        return new ArrayList<>() ; 
        
    }
    
    
}