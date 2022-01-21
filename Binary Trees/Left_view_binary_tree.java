//gfg

class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {

  
      if(root == null) return new ArrayList<>() ; 
      
      
      ArrayList<Integer> ans = new ArrayList<>() ;
      
      LinkedList<Node> que = new LinkedList<>() ;
      que.addLast(root) ;
      
      while(que.size() != 0  ){
          
          int size = que.size() ; 

          ans.add(que.getFirst().data ) ; 

          while(size-- > 0  ){
              
              Node node = que.removeFirst() ;
              
              if(node.left != null ){
                  que.addLast(node.left ) ; 
              }
              
              if(node.right != null ){
                  que.addLast(node.right) ; 
              }
              
              
          }
          
      }
      
      return ans ; 
      
      
    }
}