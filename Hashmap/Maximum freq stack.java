//leetcode 895
//unusual ques

//array list of stack is used

class FreqStack {
    
    ArrayList<Stack<Integer>> list = new ArrayList<>() ;
    HashMap<Integer , Integer> freq =  new HashMap<>() ; 
    int maxfreq = 0   ; 
     //    list.add(new Stack<>());

    public FreqStack() {  //constructor
        
     //   this.maxfreq = 0  ;
       // this.list = new ArrayList<>() ;
         //this.freq = new HashMap<>() ;
        
       list.add(new Stack<>()); //dummy stack
        
    }
    
    public void push(int x) {
        
       
        
        freq.put(x , freq.getOrDefault(x,0)+1 ) ; 
        
        maxfreq = Math.max(maxfreq , freq.get(x)) ; 
        
        if(maxfreq == list.size()) list.add(new Stack<>()) ; 
        
        
        list.get(freq.get(x) ).push(x) ; 
        
        
        
    }
    
    public int pop() {
        
       // if(list.get(maxfreq).size() != null){
            int rv = list.get(maxfreq).pop() ;
            
            if(list.get(maxfreq).size() == 0){
                maxfreq-- ; 
            }
        freq.put(rv , freq.get(rv)-1) ; 
       // }
            
        
        return rv ; 
        
    }
}
