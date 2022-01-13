//leetcode 234

class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null ) return true ; 
        
        //find mid
        
        ListNode fast = head ; 
        ListNode slow = head ; 
        
        while(fast.next!= null && fast.next.next != null ){
            
            fast = fast.next.next ; 
            slow = slow.next ; 
            
        }
        
        ListNode mid = slow.next ; 
      slow.next = null ; 
        
        ListNode nhead = reverseLL(mid ) ; 
        
        ListNode curr1 = head ; 
        ListNode curr2 = nhead ; 
        
        while(curr1 != null && curr2 != null){
            
            if(curr1.val != curr2.val ) return false ; 
            
            curr1 = curr1.next ; 
            curr2 = curr2.next ; 
            
        }
        return true ; 
        
    }
    public ListNode reverseLL(ListNode rhead ){
        
        ListNode curr = rhead ; 
        ListNode prev = null ; 
        
        while(curr != null){
            
            ListNode forw = curr.next ; 
            curr.next = prev ; 
            prev = curr ; 
            curr = forw ; 
            
        }
        
        return prev ; 
        
    }
    
}