//leetcode 1497
// Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
// Output: true
// Explanation: Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).

// Input : -4 -7 5 2 9 1 10 4 -8 -3
// Output: True

class Solution {
    public boolean canArrange(int[] arr, int k) {
            
        int n = arr.length ;
        
        for( int i = 0 ; i < n ; i++ ){
            
            arr[i] = ( arr[i] % k + k )% k ;
            
        }
     
        HashMap<Integer , Integer> map = new HashMap<>() ;
        
        for( int i = 0 ; i < n ; i++ ){
            
            int val = arr[i] ;
            if(val == 0){
                if(map.containsKey( val )) map.remove(val) ;
                else map.put(val ,1) ; 
                
            }else{
                
                if( map.containsKey(k-val) ){
                    int ov = map.get(k-val) ;
                    ov-- ; 
                    if(ov == 0 ) map.remove(k-val) ;//complete pairing hogyi
                    else map.put(( k-val) , ov) ; //complete nahi hui some pairs left
                }else{
                    map.put(val , map.getOrDefault(val , 0 ) + 1) ; 
                }
                
            }
            
        }
        
        
        if(map.size() == 0 ) return true ;
        else return false;
        
        
    }
}