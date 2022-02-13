class Compute 
{
    static pair getMinMax_rec(long a[], int l , int r )  
    {
        pair mypair = new pair() ; 
        if( l == r ){
            
            mypair.first = a[l];
            mypair.second = a[l] ;
            
            return mypair ; 
            
        }
        
        
        
        
        
        pair left  = new pair() ;
        pair right  = new pair() ; 
        int mid = (l+r)/2 ; 
        left = getMinMax_rec( a , l , mid ) ;
        right = getMinMax_rec( a , mid+1 , r ) ; 
        
        mypair.min = Math.min( left.first , right.first );
        mypair.max = Math.max( left.second , right.second ) ; 
        
        return mypair;
        
        
        
        
    }
    
    static pair getMinMax(long a[], long n)  
    {
        
        
     
        return getMinMax( a , 0 , n-1 ) ;
        
        
    }
}