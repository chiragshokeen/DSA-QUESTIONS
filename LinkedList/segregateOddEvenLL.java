class Solution{
    
    Node th1 = null ; 
    Node tt1 = null ; 
    
    Node th2 = null ; 
    Node tt2 = null ; 
    Node divide(int N, Node head){
        
        Node curr = head ; 
        
        while( curr != null){
            Node forw =curr.next ; 
            curr.next = null ; 
            if(curr.data % 2 == 0 ){
                addLastEven(curr) ;
            }else{
                addLastOdd(curr) ;
            }
            curr = forw ; 
        }
        
        if( th1 != null ) tt1.next = th2 ;
        
        
        
        
        return ( th1 != null ? th1 : th2 ) ; 
        
    }
    
    void addLastEven(Node node){
        
        if( th1 == null ){
            th1 = node ; 
            tt1 = node ;
        }else{
            tt1.next = node ;
            tt1 = tt1.next ; 
        }
        
    }
    
    void addLastOdd( Node node ){
        
        if( th2 == null ){
            th2 = node ;
            tt2 = node ;
        }else{
            tt2.next = node ;
            tt2 = tt2.next ; 
        }
        
    }
    
}