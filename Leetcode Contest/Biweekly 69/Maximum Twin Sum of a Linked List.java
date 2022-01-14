//leetcode 2130. Maximum Twin Sum of a Linked List


// In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

// For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
// The twin sum is defined as the sum of a node and its twin.

// Given the head of a linked list with even length, return the maximum twin sum of the linked list.

 

class Solution {
    public int pairSum(ListNode head) {
        
        
        int n = size( head ) ; 
        if( n == 2 ){
            return head.val + head.next.val ; 
        }
            
        ListNode temp = head ;
        int count = 0 ; 
        while( count < (n/2)-1 ){
            temp = temp.next ; 
            count++;
        }
        
        ListNode nhead = temp.next ; 
        temp.next = null ; 
        
        ListNode rhead = reverseList( nhead ) ; 
        
        int sum = 0 ; 
        temp = head ; 
        
        while(rhead != null  ){
            
            sum = Math.max( rhead.val+temp.val , sum ) ;
            rhead = rhead.next ;
            temp = temp.next ; 
            
        }
        
        return sum ; 
        
    }
    
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
    
    public static int size(ListNode head){
        
        int count = 0 ; 
        ListNode temphead = head;
        while( temphead != null ){
            count++ ; 
            temphead = temphead.next  ;
        }
        
        return count ; 
        
    }
}