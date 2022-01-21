   
     static class verticalPair {
        Node node = null;
        int hl = 0; // horizontal Level
    
        verticalPair(Node node, int hl) {
            this.node = node;
            this.hl = hl;
        }
    }


public static List<List<Integer>> diagonalOrderTraversal(TreeNode root) {
    LinkedList<verticalPair> que = new LinkedList<>();
    que.addLast(new verticalPair(root, 0));
    HashMap<Integer, List<Integer>> map = new HashMap<>();

    int minHL = 0;
    int maxHL = 0;

    while (que.size() != 0) {
        int size = que.size();
        while (size-- > 0) {
            verticalPair rp = que.removeFirst();

            map.putIfAbsent(rp.hl, new ArrayList<>());
            // if (!map.containsKey(rp.hl))
            // map.put(rp.hl, new ArrayList<>());

            map.get(rp.hl).add(rp.node.val);

            minHL = Math.min(minHL, rp.hl);
            maxHL = Math.max(maxHL, rp.hl);

            if (rp.node.left != null)
                que.addLast(new verticalPair(rp.node.left, rp.hl - 1));

            if (rp.node.right != null)
                que.addLast(new verticalPair(rp.node.right, rp.hl));
        }
    }

    List<List<Integer>> ans = new ArrayList<>();
    while (minHL <= maxHL) {
        ans.add(map.get(minHL));
        minHL++;
    }

    return ans;
}


//gfg slight different

