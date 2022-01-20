// https://practice.geeksforgeeks.org/problems/maximum-path-sum/1/

//left se answer , right se answer , apna answer including me

//inmei se best wala answer store in global

class Tree
{
    
    int maxleaftoleaf = -(int)1e9 ;
    int maxPathSum(Node root)
    { 
        if(root == null) return Integer.MIN_VALUE;
        maxPathSum_(root) ;
        return maxleaftoleaf;
    } 
    int maxPathSum_(Node root)
    { 
       
        if(root == null) return -(int)1e9 ;
        
        if(root.left == null && root.right == null ) return root.data ; 
        
        int leftans = maxPathSum_(root.left) ;
        int rightans = maxPathSum_(root.right) ;
        
        
        maxleaftoleaf = Math.max(maxleaftoleaf , leftans + rightans + root.data ) ; 
         
        return Math.max(leftans , rightans) + root.data ; 
        
        
    } 
}