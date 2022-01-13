//leetcode 148 

// Input: head = [4,2,1,3]
// Output: [1,2,3,4]

class Solution {
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null ) return head ; 
        
        ListNode mid = findmidnode(head) ; 
        
        ListNode nhead = mid.next ; 
        
        mid.next = null ;
            
         ListNode leftnode = sortList(head) ; //left wali sort hoke aajye
        ListNode rightnode = sortList(nhead) ; //right wali sort hoke aajye
        
        return merge2lists(leftnode , rightnode ) ; // dono ko merge mai krdunga
        //imp is that sortlist functuon is return what merge2lists will return
        
        
    }
    
    public ListNode findmidnode(ListNode head ){
        
        if(head == null || head.next == null ) return head ; 
        
        ListNode fast = head ; 
        ListNode slow = head ; 
        
        //for pehle wala mid
        while(fast.next != null && fast.next.next != null ){
            fast=fast.next.next ; 
            slow = slow.next ; 
        }
        
        
        return slow ; 
        
    }
    
    public ListNode merge2lists(ListNode l1 , ListNode l2 ){
        
        if(l1 == null || l2 == null  ){
            return l1 == null ? l2 : l1 ; 
        }
        
        ListNode dummy = new ListNode(-1) ;
        ListNode prev = dummy ; 
        
        ListNode c1 = l1 ; 
        ListNode c2 = l2 ; 
        
        while(c1 != null && c2 != null ){
            
            if(c1.val < c2.val ){
                
                prev.next = c1 ; 
                c1 = c1.next ; 
                
            }else{
                
                prev.next = c2 ; 
                c2 = c2.next ;
            }
            
            prev = prev.next ; 
            
        }
        
        if(c1 != null ){
            prev.next = c1 ; 
        }else{
            
            prev.next = c2 ; 
            
        }
        
        
        return dummy.next ; 
        
    }
    
}