class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   
	   HashMap<Integer, Integer> map = new HashMap<>() ;
	   
	   for( int i : arr ){
	       map.put( i , 1 ) ; 
	   }
	   
	   int len = 0 ; 
	   
	   for( int i = 0 ; i < arr.length ; i++ ){
	       map.remove(arr[i]) ; 
	       int next  = arr[i]+1;
	       int prev = arr[i]-1;
	       
	       while( map.containsKey(next) ){
	           
	               map.remove(next) ;
	               next++ ; 
	        
	       }
	       
	       while( map.containsKey(prev) ){
	                map.remove(prev) ; 
	               prev-- ; 
	          
	       }
	       
	       len = Math.max( len , next-prev-1 );
	       
	       
	       
	   }
	   
	   
	   return len;
	   
	   
	}
}