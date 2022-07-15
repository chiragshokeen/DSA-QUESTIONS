//leetcode 206

//iterative approach
class Solution {
    public ListNode reverseList(ListNode head) {
        
                
        if(head == null || head.next == null ) return head ; 
        
        ListNode curr = head ; 
        ListNode prev = null ; 
        
        
        while(curr != null ){
            
            ListNode forw = curr.next ; 
            
            curr.next = prev ; 
            prev = curr ; 
            curr = forw ; 
            
        }
        
        return prev ; 
        
        
    }
}

//recursive approach

class Solution {
    public ListNode reverseList(ListNode head) {
        
        //recursive solution
        
       return reverseRecursive( null , head ) ; 
        
    }
    
    public ListNode reverseRecursive( ListNode prev , ListNode node ){
        
        if( node == null ){
            return prev; 
        }
        
        ListNode forw = node.next ; 
        node.next = prev ;
        
        return reverseRecursive( node , forw ) ; 
        
    }
    
}