class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<String> st = new Stack<>() ;
        
        for( String s : tokens ){
            
            if( isOperator(s) ){
                
                int rem2 = Integer.valueOf(st.pop()) ;
                int rem1 = Integer.valueOf( st.pop() ) ;
                
                st.push( calculate( rem1 , rem2 , s ) ) ;
                
                
            }else{
                st.push(s) ;
            } 
            
        }
        return Integer.valueOf(st.peek()) ;
        
    }
    
    public boolean isOperator( String s ){
        
        if( s.equals("+") || s.equals("/") || s.equals("-") || s.equals("*") ){
            return true;
        }
        
        return false;
    }
    
    public String calculate(int rem1 , int rem2 , String opr){
        
        if( opr.equals("+") ){
            return String.valueOf( rem1+rem2 ) ;
        }else if( opr.equals("-") ){
             return String.valueOf( rem1-rem2 ) ;
        }else if(opr.equals("*")){
             return String.valueOf( rem1*rem2 ) ;
        }else if(opr.equals("/")){
             return String.valueOf( rem1/rem2 ) ;
            
            
        }
        
        return "" ;
        
    }
    
}