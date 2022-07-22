class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
             
             Node curr = root ; 
             Node pred = null ; 
             Node succ = null ; 
             while(curr!= null ){
                 
                 if(curr.data == x.data ){
                     
                     if(curr.right!=null ){
                         succ = curr.right;
                         while(succ.left!=null ){
                             succ = succ.left;
                         }
                     }
                     break;
                 }else if( curr.data > x.data  ){
                     
                     succ= curr ; 
                     curr = curr.left;
                     
                 }else if(curr.data < x.data){
                     pred = curr;
                     curr = curr.right;
                 }
                 
                 
             }
          return succ ; 
         }
}