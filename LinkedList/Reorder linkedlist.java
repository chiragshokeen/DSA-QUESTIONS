//leetcode 143
// Input: head = [1,2,3,4,5]
// Output: [1,5,2,4,3]


class Solution {
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null ) return  ; 
        
        ListNode fast = head ; 
        ListNode slow = head ; 
        
        while(fast.next != null && fast.next.next != null )
        {
            
            fast = fast.next.next ; 
            slow = slow.next ; 
            
            
        }        
        
        ListNode mid = slow.next ; 
        slow.next = null ; 
        
        ListNode nhead = reversell(mid) ; 
        
        ListNode h1 = head ; 
        ListNode h2 = nhead ; 
        
        while(h1 != null && h2 != null ){
          
            ListNode t1 = h1.next ; 
            ListNode t2 = h2.next ; 
            
            h1.next = h2 ; 
            h2.next = t1 ; 
            h1=t1 ; 
            h2=t2 ; 
            
            
        }
        
        
        
    }
    
    public ListNode reversell(ListNode nhead){
        
        ListNode curr = nhead ; 
        ListNode prev = null ; 
        
        while(curr !=null ){
            
            ListNode forw = curr.next ; 
            curr.next = prev ; 
            prev = curr ; 
            curr = forw ; 
            
            
        }
        
        return prev ; 
        
        
    }
    
}