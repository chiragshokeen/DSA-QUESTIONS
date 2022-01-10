//leetcode 347
// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]


//brute force method

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>() ;
        
        for( int ele : nums ){
            
            map.put(ele , map.getOrDefault(ele , 0) + 1  )  ;
            
        }
        
        int t = k ;
        int i = 0 ;
        int[] ans= new int[k] ; 
        while( t > 0 ){
            
            int maxfreqele = getmaxele(map ) ; 
            map.remove(maxfreqele ) ; 
            ans[i++] = maxfreqele ; 
            t-- ; 
            
            
        }
        return ans ; 
    }
    
    public int getmaxele(HashMap<Integer , Integer> map){
        
        
        int maxele = 0 ; 
        int maxfreq =  0 ; 
        for( int key : map.keySet()){
            
            if( map.get(key) > maxfreq ){
                maxfreq = map.get(key) ; 
                maxele = key ; 
            }
            
        }
        
        return maxele ; 
        
    }
    
}

//efficient method
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int ele : nums) map.put(ele,map.getOrDefault(ele,0) + 1);
    
    // data,freq
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
        return a[1] - b[1];//other - this
    });
    
    for(int ele : map.keySet()){
        pq.add(new int[]{ele,map.get(ele)});
        if(pq.size() > k) pq.remove(); 
    }
    
    int[] ans = new int[k];
    int idx = 0;
    while(pq.size() != 0){
        int[] d = pq.remove();
        ans[idx++] = d[0];
    }
    
    return ans;   
}
}