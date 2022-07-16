public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
          if(headA == null || headB == null ){
            return null ; 
        }
        
        ListNode tailA = headA ; 
        
        
        while( tailA.next != null ){
            tailA = tailA.next ; 
        }
        
        tailA.next = headB ; 
        
        ListNode ans = cyclePoint( headA ) ; 
        tailA.next = null ; 
        
        return ans ; 

    }
    
    public ListNode cyclePoint( ListNode head ){
        
        if(head == null ||  head.next == null ) return null ;
        
        ListNode slow = head ; 
        ListNode fast = head ;
        boolean isCycle = true;
        while( fast != null && fast.next != null ){
            slow = slow.next ; 
            fast =fast.next.next ; 
            
            if( slow == fast ){
                 
                break ;
            }
            
        }
        
        if(slow != fast ) return null ; 
        
        slow = head ;
        while( slow != fast ){
            slow = slow.next ; 
            fast = fast.next ; 
        }
        
        return slow; 
        
        
    }
    
    
}