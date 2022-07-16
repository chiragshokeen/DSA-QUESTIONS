class Solution{
    
   
    static int temp = 0;
	public static Node zigZag(Node head){
        
        boolean flag = true;
 
        // Traverse linked list starting from head.
        Node current = head;
        while (current != null && current.next != null) {
            if (flag == true) /* "<" relation expected */
            {
              
                if (current.data > current.next.data) {
                    temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            }
            else /* ">" relation expected */
            {
            
                if (current.data < current.next.data) {
                    temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            }
 
            current = current.next;
 
            /* flip flag for reverse checking */
            flag = !(flag);
        }
        
        
        return head ; 
    }
        
        
        
      
        
        
    
}