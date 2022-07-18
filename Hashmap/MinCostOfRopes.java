class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        
        PriorityQueue<Long> pq = new PriorityQueue<>() ;
        
        for( long ele : arr ){
            pq.add(ele) ;
        }
        long cost = 0 ; 
        
        while( pq.size()  >  1 ){
            
            long a = pq.remove() ;
            long b = pq.remove() ;
            cost += (a+b); 
            pq.add( a+b ) ; 
            
            
        }
        
        return cost ; 
        
    }
}