class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	Stack<Integer> st = new Stack<>() ;
    	
    	for( int i = n-1 ; i >= 0 ; i-- ){
    	    
    	    st.push(i);
    	    
    	}
    	
    	
    	while( st.size() > 1 ){
    	    
    	    int px = st.pop() ;
    	    int py = st.pop() ;
    	    
    	    if( M[px][py] == 1 ){
    	        st.push(py) ;
    	    }else{
    	        st.push(px) ;
    	    }
    	    
    	    
    	}
    	
    	int candidate = st.pop() ;
    
    	
    	for( int i = 0 ; i < n ; i++ ){
    	    
    	    if( i != candidate && M[i][candidate] == 0 || M[candidate][i] == 1 ){
    	        return -1;
    	    }
    	    
    	}
    	
    	return candidate;
    	
    }
}