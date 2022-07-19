class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    
	    int[] ans = new int[n] ;
	    
	    Stack<Integer> st = new Stack<>() ;
	    
	    for(int i = n-1 ; i>= 0 ; i--){
	        
	        
	        while( st.size() > 0 && arr[i] <= st.peek() ){
	            st.pop() ;
	        }
	        
	        if(st.size() == 0){
	            ans[i] = -1;
	        }else{
	            ans[i] = st.peek() ;
	        }
	        
	        st.push(arr[i]);
	        
	    }
	    
	    
	    return ans;
	    
	} 
}