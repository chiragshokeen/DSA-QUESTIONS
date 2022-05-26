class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        
        if( total < cost1 && total < cost2 ) return 1;
        
        if( cost1 > total ){
            return total/cost2 + 1 ; 
        }
        
           if( cost2 > total ){
            return total/cost1 + 1 ; 
        }
        
        
        int maxpen = total/cost1; // we will fix one of the items
        int grandtotal = total;
        long ans = 0 ; 
    
        for( int i = 0 ; i <= maxpen ; i++ ){
            total = grandtotal - i*cost1; //reducinng total
              if(total <= 0) { //our sum has finished
                  ans++;
                  break;
              }
            ans+=(total/cost2)+1;
          
            
        }
        
        return ans;
        
        
        
    }
}