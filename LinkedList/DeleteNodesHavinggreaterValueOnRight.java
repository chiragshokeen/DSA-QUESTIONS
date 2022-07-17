//gfg

class Solution
{
    Node compute(Node head)
    {
    if(head == null || head.next == null) return head;
         Node nextNode = compute(head.next);
 
         if(nextNode.data > head.data) return nextNode;
         head.next = nextNode;
 
         return head;
    
    }
}
  