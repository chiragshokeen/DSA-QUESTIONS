class Solution{
    
    
    static int MAX = Integer.MAX_VALUE;
   static int MIN = Integer.MIN_VALUE;

   static class nodeInfo {
       int size; // Size of subtree
       int max; // Min value in subtree
       int min; // Max value in subtree
       boolean isBST; // If subtree is BST

       nodeInfo() {}

       nodeInfo(int size, int max, int min, boolean isBST)
       {
           this.size = size;
           this.max = max;
           this.min = min;
           this.isBST = isBST;
       }
   }
   
    static nodeInfo largestBST(Node root)
   {

       // Base case : When the current subtree is empty or
       // the node corresponds to a null.
       if (root == null) {
           return new nodeInfo(0, Integer.MIN_VALUE,
                               Integer.MAX_VALUE, true);
       }
   
       nodeInfo left = largestBST(root.left);
       nodeInfo right = largestBST(root.right);

      
       nodeInfo returnInfo = new nodeInfo();

       returnInfo.min = Math.min(
           Math.min(left.min, right.min), root.data);
       returnInfo.max = Math.max(
           Math.max(left.max, right.max), root.data);
       returnInfo.isBST = left.isBST && right.isBST
                          && root.data > left.max
                          && root.data < right.min;

       if (returnInfo.isBST)
           returnInfo.size = left.size + right.size + 1;
       else
           returnInfo.size
               = Math.max(left.size, right.size);

       return returnInfo;
   }
   
   // Return the size of the largest sub-tree which is also a BST
   static int largestBst(Node root)
   {
       // Write your code here
       
       return largestBST(root).size ; 
       
       
   }
   
}