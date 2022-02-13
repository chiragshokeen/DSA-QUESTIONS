class Solution
{
    public static void sort012(int a[], int n)
    {
        
        int i = 0 ; 
        int p1 = -1;
        int p2 = n-1 ;
        
        while( i <= p2 ){
            
            if( a[i] == 0 ){
                p1++ ;
                swap( a , p1 , i ) ;
                i++ ;
                
            }else if( a[i] == 2 ){
                swap( a , i , p2 );
                p2-- ;
   
            }else{
                i++ ; 
            }
            
            
        }
        
      
    }
    
    public static  void swap( int[] arr , int i , int j ){
        
        
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ; 
        
    }
    
}