class Solution {
    public int majorityElement(int[] arr) {
        
     //without sorting using moore algoithm
        
       int count = 0 ;
        int candidate = 0 ; 
        
        for( int num : arr ){
            
            if( count == 0 ){
                candidate = num ; 
            }
            
            if( num == candidate  ){
                count++;
            }else{
                count-- ; 
            }
            
            
        }
        
        return candidate ; 
      
    }
}