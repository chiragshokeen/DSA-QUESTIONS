class Solution
{
    //Function to count number of nodes in BST that lie in the given range.

    int getCount(Node root,int l, int r)
    
    {
        //Your code here
        ArrayList<Integer> arr = new ArrayList<>() ;
        fillArray( root , arr ) ;
        
        int n = arr.size() ;
        
        int si = 0 ; 
        int ei = n-1 ;
        
        while(  si < n && arr.get(si) < l  ){
            
            si++ ;
            
        }
        
        while(ei > -1 && arr.get(ei)  > r  ){
            ei-- ; 
        }
        
        if( si == n || ei == -1 ){
            return 0 ; 
        }
        return ei-si + 1 ;
    
        
    }
    
    public void fillArray( Node node , ArrayList<Integer> arr ){
        if(node == null){
            return;
        }
        
        fillArray( node.left , arr ) ; 
        arr.add(node.data) ;
        fillArray( node.right , arr ) ; 
        
    }
    
}


//recursion

class Tree
{
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
      
      if( root == null ) return 0 ; 
      
        int left = 0 ;      
        if(root.data > l  ){
            left = getCount( root.left , l , h );
        }
        
        int right = 0 ;
        if( root.data < h ){
            right = getCount( root.right , l , h ) ;
        }
        
        int myans = left + right ;
        if( root.data >= l && root.data <= h ){
            myans++ ; 
        }
        
        return myans ; 
        
    }
}