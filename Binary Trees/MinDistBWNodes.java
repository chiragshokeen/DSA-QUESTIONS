class GfG {
    
    public List<Integer> LCA( Node node , int val ){
        
        if( node == null ){
            return new ArrayList<>() ;
            
        }
        
        if( node.data == val ){
            List<Integer> base = new ArrayList<>() ;
            base.add(node.data) ;
            return base ; 
        }
        
        List<Integer> left = LCA( node.left , val ) ;
        if(left.size() > 0){
            left.add( node.data ) ;
            return left ; 
        }
        
         List<Integer> right = LCA( node.right , val ) ;
        if(right.size() > 0){
            right.add( node.data ) ;
            return right ; 
        }
        
        return new ArrayList<>() ;
        
        
        
    }
    
    int findDist(Node root, int a, int b) {
        
       
        List<Integer> list1 = LCA( root , a ) ;
        List<Integer> list2 = LCA( root , b) ; 
      
        // for( int i = 0 ; i < list1.size() ; i++ ){
        //     System.out.print( list1.get(i) +" " ) ; 
        // }
        // System.out.println() ;
        
        
        //   for( int i = 0 ; i < list2.size() ; i++ ){
        //     System.out.print( list2.get(i) +" " ) ; 
        // }
        
        // System.out.println() ; 
        
        int i = list1.size() -1 ; 
        int j = list2.size() -1 ;
     
      //  System.out.print(j+" ") ;
      
        
        while( i >= 0 && j >= 0  ){
          //   System.out.println(list1.get(i) +" " + list2.get(j) ) ; 
            if( list1.get(i) ==  list2.get(j) ){
                i-- ;
                j-- ; 
               
            }
            else{
               
                return i+j+2 ;
            }
        }
        
        if( i == -1 || j == -1 ) return ( i != -1 ? i+1 : j +1  );
        return 0 ; 
        
    }
}