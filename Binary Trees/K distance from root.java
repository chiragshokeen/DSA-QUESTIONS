class Tree
{
     
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          ArrayList<Integer> ans = new ArrayList<>() ; 
          
          helper( root , ans , k ) ; 
          
          return ans ; 

     }
     
     void helper( Node node , ArrayList<Integer> ans , int k ){
         
         if( node == null   ){
             return ;
         }
         
         if( k == 0 ){
             ans.add( node.data ) ;
             return ; 
         }
         
         helper( node.left , ans , k-1 ) ;
         helper( node.right , ans , k-1  ) ; 
         
         
     }
}