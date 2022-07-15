class Solution {
    
    ListNode th = null ; 
    ListNode tt = null ; 
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null) return head ; 
        
        
        ListNode curr = head ; 
        while(curr!=null ){
            
            ListNode forw = curr.next ; 
            curr.next = null ; 
            addLast(curr) ; 
            
            curr = forw ; 
            
            
        }
        
        return head ;
        
    }
    
    public void addLast(ListNode node){
        
        
        if(th == null  ){
            th =node ; 
            tt = node ; 
        }
         else if(tt.val != node.val){
             tt.next = node;
             tt = node ; 
         }   
        
        
    }
}