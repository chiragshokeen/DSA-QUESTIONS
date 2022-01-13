//gfg
// N = 7, K = 4
// A[] = {1,2,1,3,4,2,3}
// Output: 3 4 4 3

class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        HashMap<Integer , Integer> map = new HashMap<>() ;
        
        int si = 0 ; 
        int ei = 0 ; 
        ArrayList<Integer> ans = new ArrayList<>() ;
        
        while(ei < n ){
            
            map.put(arr[ei] , map.getOrDefault( arr[ei] , 0 )+ 1  ) ;
            ei++ ;
            
            if( ei >= k ){
                ans.add( map.size() ) ;
                int key = arr[si] ;
                int val = map.get(arr[si]) ;
                val-- ; 
                if(val == 0 ) map.remove(key) ;
                else map.put( key , val ) ;
                si++ ; 
            }
                
        }
        
        return ans ; 
    }
}

