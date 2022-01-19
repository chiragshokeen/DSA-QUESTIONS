

// public class TreeNode{

//     int val ; 
//     TreeNode left ;
//     TreeNode right ;

//     TreeNode{
//         this.val = val ; 
//     }


// }

class solution{

    public static int size(TreeNode node){

        return node == null ? 0 : size(node.left) + size(node.right)+ 1 ; 

    }


    public static int height(TreeNode node){

        //in terms of nodes
        return node == null ? 0 : Math.max(height(node.left) , height(node.right)  )+1 ; 

        //in terms of edges
        return node == null ? -1 : Math.max(height(node.left) , height(node.right)  )+1 ; 

    }

    public static int maximum(TreeNode node){

        return node == null ? -(int)1e9 : Math.max( Math.max(maximum(node.left ) , maximum(node.right)) , node.val ) ;


    }

    public static boolean find(TreeNode node , data){

        if(node == null) return false;

        if(node.val == data) return true;

        return find(node.left,data) || find(node.right , data) ; 

    }



}

