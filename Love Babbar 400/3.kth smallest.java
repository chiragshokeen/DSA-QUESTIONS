
//o(nlogn)
// class Solution{
//     public static int kthSmallest(int[] arr, int l, int r, int k) 
//     { 
//         //Your code here
        
//         Arrays.sort(arr) ;
//         return arr[k-1] ; 
        
//     } 
// }



//o(n)

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        
        //max pq
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            
            return b-a ; 
            
            }) ;
        
        for( int i = 0 ; i < arr.length ; i++ ){
            
            pq.add(arr[i]) ;
            
            if( pq.size() > k ){
                pq.remove() ;
            }
            
            
            
        }
        
        return pq.peek() ;
        
    } 
}