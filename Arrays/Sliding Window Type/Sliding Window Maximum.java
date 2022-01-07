import java.util.PriorityQueue;

//leetcode 239
//Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
//Output: [3,3,5,5,6,7]


class solution{


    public int[] maxSlidingWindow(int[] arr, int k){

        if( arr.length == 1 || k == 1 ) return arr ; 

        ArrayList<Integer> ans = new ArrayList<>() ;

        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b)->{
            return arr[b] - arr[a] ; 
        } ) ; 

        for( int i = 0 ; i < arr.length ; i++ ){

            while( pq.size() != 0 && pq.peek() <= i-k  ){
                pq.remove() ;
            }
            pq.add(i) ;

            if(i>=k-1){
                ans.add( arr[pq.peek()] ) ; 
            }

        }

        int[] ansarr = new int[ans.size()] ; 
        for(int i = 0 ; i < ans.size() ; i++ ){
            ansarr[i] = ans.get(i) ; 
        }
        return ansarr ;




    }



}