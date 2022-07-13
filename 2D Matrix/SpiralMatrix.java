class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        
        int n = arr.length ;
        int m = arr[0].length ; 
        
        List<Integer> ans = new ArrayList<>() ;
        
        int te = n*m ; 
        int count=0 ; 
        
        int rmin = 0 ;
        int rmax = n-1 ;
        int cmin = 0 ;
        int cmax = m-1 ;
        
        while( count < te){
            
            for( int c = cmin ; c <= cmax && count< te ; c++ ){
                ans.add( arr[rmin][c] ) ;
            
                count++ ; 
            }
            rmin++ ; 
            
            for( int r = rmin ; r <= rmax && count< te; r++ ){
                
                ans.add( arr[r][cmax] ) ;
            //    System.out.println("2") ; 
                count++ ; 
                
            }
            cmax-- ; 
            
            for( int c = cmax ; c>=cmin && count< te ; c-- ){
                ans.add( arr[rmax][c] ) ;
             
                count++ ; 
            }
            rmax-- ; 
            
            
            for( int r = rmax ; r >= rmin && count< te ; r-- ){
                ans.add( arr[r][cmin] ) ;
             
                count++ ; 
            }
            cmin++ ; 
            
         
            
        }
        
        return ans ; 
        
    }
}