//dijkstra application

class Solution {
    public class Pair {
        int v ; 
        double prob ; 
        
        Pair( int v , double prob  ){
            this.v = v ; 
            this.prob = prob ; 
        }
        
     
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        
         List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Pair>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new Pair(edges[i][1],succProb[i]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0],succProb[i]));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1,p2)->Double.compare(p2.prob,p1.prob)) ;
        pq.add( new Pair( start , 1.0  ) ) ;
        double probs[]=new double[n];
        double maxp = 0.0 ;
        while( pq.size() > 0 ){
            
           Pair curr = pq.remove() ;
           
 
            for(Pair x : adj.get(curr.v)){
                if(((curr.prob)*(x.prob))>probs[x.v]){
                    probs[x.v]=((curr.prob)*(x.prob));
                    pq.add(new Pair(x.v,probs[x.v]));
                    
                }
                else{
                    continue;
                }
            }
        }
        
       return probs[end];
    }
}