//last element of vertical order
//gfg
class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public  class verticalPair {
    Node node = null;
    int hl = 0; // horizontal Level

    verticalPair(Node node, int hl) {
        this.node = node;
        this.hl = hl;
      }
    }
    
    public  List<List<Integer>> verticalOrderTraversal(Node root) {
    LinkedList<verticalPair> que = new LinkedList<>();
    que.addLast(new verticalPair(root , 02));
    HashMap<Integer, List<Integer>> map = new HashMap<>();

    int minHL = 0;
    int maxHL = 0;

    while (que.size() != 0) {
        int size = que.size();
        while (size-- > 0) {
            verticalPair rp = que.removeFirst();

            map.putIfAbsent(rp.hl, new ArrayList<>());
            

            map.get(rp.hl).add(rp.node.data);

            minHL = Math.min(minHL, rp.hl);
            maxHL = Math.max(maxHL, rp.hl);

            if (rp.node.left != null)
                que.addLast(new verticalPair(rp.node.left, rp.hl - 1));

            if (rp.node.right != null)
                que.addLast(new verticalPair(rp.node.right, rp.hl + 1));
        }
    }

    List<List<Integer>> ans = new ArrayList<>();
    while (minHL <= maxHL) {
        ans.add(map.get(minHL));
        minHL++;
    }

    return ans;
}

    public ArrayList <Integer> bottomView(Node root)
    {
        List<List<Integer>> vo = verticalOrderTraversal(root) ; 
        
        ArrayList<Integer> ans = new ArrayList<>() ;
        
        for( List<Integer> sl : vo ){
            ans.add( sl.get(sl.size()-1) ) ; 
        }
        
        return ans ; 
    }
}