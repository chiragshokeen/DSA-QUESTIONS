//leetcode 380

class RandomizedSet {

    HashMap<Integer,Integer> map = new HashMap<>() ;
    
    ArrayList<Integer> list = new ArrayList<>() ;
    
    Random rand = new Random() ;
    
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        
        if(map.containsKey(val) ) return false;
        
        map.put(val , list.size() ) ; 
        list.add(val) ;
        
        return true ; 
        
        
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        
        if(!map.containsKey(val) ) return false;
        
        int cidx = map.get(val) ; 
        int lidx = list.size()-1 ; 
        
        map.put(list.get(lidx) , cidx ) ; 
        map.remove(val) ; 
        
        list.set(cidx , list.get(lidx) ) ;
        list.remove(lidx) ; 
        
        return true;
        
        
        
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        
        int idx = rand.nextInt(list.size()) ; 
        return list.get(idx) ; 
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */