//leetcode 146

class LRUCache {
    
    private class Node{
        int key = 0 ; 
        int value = 0 ; 
        
        Node next = null ; 
        Node prev = null ; 
        
        Node(int key , int value ){
            this.key = key ;
            this.value = value ; 
        }
    }
    
    
    private Node head = null ; 
    private Node tail = null ; 
    private int size = 0 ; 
    private int MaxCapacity = 0 ; 
    private HashMap<Integer , Node> map ; 

    public LRUCache(int capacity) {
        this.MaxCapacity = capacity ; 
        map = new HashMap<>() ; 
    }
    
    private void addFirst(Node node ){
        
        if(this.size == 0  ){
            this.head = node ; 
            this.tail = node ;
            
        }else{
            this.head.next = node;
            node.prev = this.head;
            this.head = node;
            
        }
        this.size++ ; 
    }
    
    private Node removeNode(Node node){
        if(this.size == 1 ){
            this.head = null ;
            this.tail = null;
            this.size-- ; 
            return node;
        }else if(this.tail == node ){
            
            return removeLast() ; 
            
        }else{
            
            Node prevNode = node.prev ; 
            Node nextNode = node.next ; 
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            
            node.prev= null ; 
            node.next = null ; 
            this.size--;
            
            return node;
            
        }
    }
    
    private Node removeLast(){
        if(this.size == 1 ){
            
            Node node = this.tail ; 
            this.head = null ;
            this.tail = null ; 
            this.size-- ; 
            return node ; 
            
        }
        
        Node lastNode = this.tail ;
        Node secondLastNode = lastNode.next ;
        secondLastNode.prev = null ;
        lastNode.next = null;
        this.tail = secondLastNode ;
        this.size-- ; 
        
        return lastNode ; 
        
    }
    
    private void makeMostRecent(Node node){
        if(this.head == node ) return ;
        
        removeNode(node) ;
        addFirst(node) ; 
    }
    
    public int get(int key) {
        
        if(!map.containsKey(key) )return -1 ; 
        
        Node node = map.get(key) ;
        makeMostRecent(node) ; 
        return node.value ; 
        
    }
    
    public void put(int key, int value) {
        
        
        if(map.containsKey(key) ){
            Node node = map.get(key) ;
            node.value = value ; 
            makeMostRecent(node) ;
        }else{
            if(this.size == this.MaxCapacity ){
                Node node = removeLast() ;
                map.remove(node.key); 
            }
            
            
            Node node = new Node(key , value) ; 
            addFirst(node) ;
            map.put(key,node) ; 
            
        }
        
    }
}
