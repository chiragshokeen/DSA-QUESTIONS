public static void main(String[] args) throws Exception {
        
    Scanner scn = new Scanner(System.in) ;
    String str = scn.nextLine() ;
    int n = str.length();
    Stack<Character> st  = new Stack<>() ;
    
    for( int i = 0 ; i < n ; i++ ){
        
        char ch = str.charAt(i) ;
        
        if( ch != ')' ){
            st.push(ch) ;
        }
        else{
            
            
            if( st.peek() == '(' ){
                System.out.println("true");
                return;
                
            }
            else{
                
                  while(st.peek() != '(' ){
                st.pop() ;
            }
            st.pop() ; 
                
            }
          
            
            
        }
        
        
    }
    
    System.out.println("false") ; 

}