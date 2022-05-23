class Solution {
    public double myPow(double x, int n) {
        
        double ans = 1.0 ;
        
        long nn = n ;
        if(n < 0 ) nn = -1*nn ; //to keep in range
        
        while( nn > 0  ){
            
            if( nn % 2 == 0 ){
               x = x*x ;
               nn = nn/2;
            }else{
                ans = ans * x ;
                nn = nn-1;
            }
            
            
            
        }
        
        if(n < 0 ) return (double)1.0/(double)(ans) ;
        return ans;
        
        
    }
}
