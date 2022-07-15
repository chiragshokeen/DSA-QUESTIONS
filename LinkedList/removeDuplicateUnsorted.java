//gfg

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         if( head == null || head.next == null ) return head ; 
         Node dummy = new Node(-1) ;
         Node prev = dummy ;
         
         Set<Integer> set = new HashSet<>() ;
         
         while( head != null ){
             
             if( !set.contains( head.data ) ){
                 set.add(head.data) ;
                 Node node = new Node(head.data) ;
                 prev.next = node ; 
                 prev =node ; 
             }
             head = head.next ; 
         }
         
         return dummy.next ; 
    }
}