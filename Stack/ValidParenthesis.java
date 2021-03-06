class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>() ; 
        for(int i = 0 ; i < s.length() ; i++ ){
            
            char ch = s.charAt(i) ;
            
            if(ch =='(' || ch == '{' || ch == '[' ){
                st.push(ch ) ;
            }
            
            else if(ch == ')' ){
                
                if(st.size() == 0 || st.peek()!='(' ) return false ; 
                else st.pop() ; 
                
            }
            else if(ch == '}' ){
                if(st.size() == 0 || st.peek()!='{' ) return false ; 
                else st.pop() ; 
            }
            else if(ch == ']' ){
                
                if(st.size() == 0 || st.peek()!='[' ) return false ; 
                else st.pop() ; 
                
                
            }
            
            
            
        }
        
        return st.size() == 0 ;   // end mei agar kuch bacha hai stack mei means unbalanced so erturn false like case ((()
        
        
    }
}