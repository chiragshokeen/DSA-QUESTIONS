class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        Node dummyZero = new Node(-1) ;
        Node dummyOne = new Node(-1) ;
        Node dummyTwo = new Node(-1) ;
        
        Node zero = dummyZero ; 
        Node one = dummyOne ; 
        Node two = dummyTwo ;
        
        Node curr = head; 
        
        while( curr != null ){
            
           
            
            if( curr.data == 0 ){
                
                zero.next = curr;
                zero = zero.next;
                curr = curr.next;
                
            }else if( curr.data == 1 ){
                
                one.next = curr;
                one = one.next;
                curr = curr.next;
                
            }else{
                two.next = curr;
                two = two.next;
                curr = curr.next;
            }
            
        }
        
             zero.next = (dummyOne.next!=null)
? (dummyOne.next) : (dummyTwo.next);
        one.next = dummyTwo.next;
        two.next = null;
        
        
        
        return dummyZero.next ; 
      
    }
}
