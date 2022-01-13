//gfg
// N = 8
// A[] = {15,-2,2,-8,1,7,10,23}
// Output: 5
// Explanation: The largest subarray with
// sum 0 will be -2 2 -8 1 7.

class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer , Integer> map = new HashMap<>() ;
        map.put(0,-1) ;
        
        for( int i = 1 ; i < n ; i++ ){
            arr[i] = arr[i] + arr[i-1] ; 
        }
        
        int len = 0;
        for( int i = 0 ; i < n ; i++ ){
            int val = arr[i] ;
            if( map.containsKey(val) ){
                len = Math.max( len , i - map.get(val) ) ;
            }else{
                map.put( val , i ) ;
            }
        }
        
        return len ; 
        
    }
}