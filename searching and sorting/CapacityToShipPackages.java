//leetcode 1011

class Solution {
    public int shipWithinDays(int[] arr, int D) {
        
        
        int si = 1 ; 
        
        int ei = 0 ;
        int n = arr.length;
        for(int ele : arr ){
            ei+=ele ;
        }
        
        while( si < ei ){
            
            int mid =  (ei + si)/2 ; 
            
            if( isPossibleToShip( arr , D , mid ) ){
                ei = mid;
            }else{
                si = mid + 1 ; 
            }
            
            
            
        }
        
        
        return ei;
        
    }
   private boolean isPossibleToShip(int[] weights, int D, int capacity) {
        int day = 1, w = 0;
      for(int i = 0 ; i < weights.length ; i++ ){
          
          if(weights[i] > capacity || day > D ) return false;
          
          if(w + weights[i] > capacity ){
              day+=1 ;
              w = weights[i] ; 
          }else{
              w+=weights[i] ; 
          }
          
      }
       return (day<=D) ; 
   }
    
}