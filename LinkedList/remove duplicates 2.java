//leetcode 82
// Input: head = [1,2,3,3,4,4,5]
// Output: [1,2,5]

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode(0, head);

       
        ListNode pred = dummy;
        
        while (head != null) {
           
            if (head.next != null && head.val == head.next.val) {
              
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;    
                }
               
                pred.next = head.next;     
            
            } else {
                pred = pred.next;    
            }
                
          
            head = head.next;    
        }  
        return dummy.next;
    }
}