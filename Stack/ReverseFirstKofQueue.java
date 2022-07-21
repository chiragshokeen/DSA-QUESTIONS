public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        
        
    Stack<Integer> st = new Stack<>() ;
    
    while(k > 0 && q.size()  > 0){
        
        st.add(q.remove()  ) ;
        k--;
    }
    
    
    Queue<Integer> q2 = new LinkedList<>() ;
    
    while( q.size() > 0 ){
        q2.add( q.remove() ) ;
    }  
   
   while( st.size() > 0 ){
       q.add( st.pop() );
    }
    
    while( q2.size() > 0 ){
        q.add( q2.remove() ) ; 
    }
   return q ; 
}



//better sol

   // Function to reverse first k elements of a queue.
   public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        
        
    Stack<Integer> st = new Stack<>() ;
    int n = q.size()-k ; 
    while(k > 0 && q.size()  > 0){
        
        st.add(q.remove()  ) ;
        k--;
    }

   
   while( st.size() > 0 ){
       q.add( st.pop() );
    }
    
    while( n > 0  ){
        q.add( q.remove() ) ; 
        n--;
    }
   return q ; 
}