class MyStack {
    
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private int top;
    
        public MyStack() {
            
        }
        
        public void push(int x) {
            
        q2.add(x);
        top = x;
        while (!q1.isEmpty()) {                
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
            
        }
        
        public int pop() {
            
            if( q1.size() != 0 ){
                int remval = q1.remove() ;
                if(!q1.isEmpty()){
                   top = q1.peek() ; 
                }
                
                
                return remval ; 
            }
            
            return -1;
            
        }
        
        public int top() {
            return top ; 
        }
        
        public boolean empty() {
            return q1.isEmpty() ;
        }
    }
    