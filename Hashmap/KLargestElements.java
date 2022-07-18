//gfg

class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>() ;
        
        for( int ele : arr ){
            
            pq.add(ele) ;
            
            while( pq.size()  > k){
                pq.remove() ;
                
            }
            
        }
        
        int[] ans = new int[pq.size()] ;
        
        for( int i = k-1 ; i >=0 ; i-- ){
            ans[i] = pq.remove() ; 
        }
        
        return ans;
        
    }
}