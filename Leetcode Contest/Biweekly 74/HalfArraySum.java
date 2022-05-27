class Solution {
    public int halveArray(int[] nums) {
        
        if(nums.length == 1){
            return 1;
        }
        
//        PriorityQueue<Double> pq = new PriorityQueue<Double>(new Comparator<Double>(){
//    public int compare(Double node1, Double node2){
//        if(node2>node1){
//           return 1;
//        }
//        else{
//           return -1;
//        }
//    }
// });
        
         PriorityQueue<Double> pq = new PriorityQueue<>( Collections.reverseOrder() ) ; 
        double sum = 0 ;
        for(double ele : nums){
            pq.add(ele) ;
            sum+=ele;
        }
  
       
        double newsum = 0 ;  
        int moves = 0 ; 
        while( sum - newsum > (sum/2)  ){
            
            double ele  = pq.remove() ;
            newsum += ele/2 ;
            pq.add(ele/2 ) ;
            
            moves++;
            
            
        }
        
        return moves;
        
    }
}