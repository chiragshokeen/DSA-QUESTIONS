//leetcode 21

// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        
        ListNode c1 = l1 ;
        ListNode c2 = l2 ; 
        
        ListNode dummy = new ListNode(-1) ;
        ListNode prev = dummy ; 
        
        while(c1 != null && c2 != null){
            
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
        }else if( c2 != null ){
            prev.next = c2 ; 
        }
        
        return dummy.next ; 
        
    }
}