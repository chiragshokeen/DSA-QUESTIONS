//leetcode 876
//If there are two middle nodes, return the second middle node.


class Solution {
    public ListNode middleNode(ListNode head) {
        
        if(head == null || head.next == null ) return head ; 
        
        ListNode fast = head ;
        ListNode slow = head ; 
        
        
        while(fast!= null && fast.next != null ){ //for 2nd middle

            //for 1st middle while( fast.next != null && fast.next.next != null )
            fast = fast.next.next ; 
            slow = slow.next ; 
        }
        
        return slow ; 
        
        
}