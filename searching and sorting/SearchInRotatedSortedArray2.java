class Solution {
    public boolean search(int[] arr, int data) {
        
        
        int lo = 0 ;
        int hi = arr.length-1 ;
        
        while(lo<=hi ){
            
            int mid = (lo+hi)/2 ; 
            
            if(arr[mid] == data || arr[lo] == data  )return true ; // lo ko check krna hai
            else if(arr[mid] > arr[lo] ){  // remove equal sign 
                
                if(arr[lo]<=data && data < arr[mid] ) hi = mid - 1;
                else lo = mid + 1 ; 
                
            }else if( arr[mid] < arr[hi]  ){
                if(arr[mid]< data && data <= arr[hi] ) lo = mid + 1 ;
                else hi = mid -1 ;
            }
             else lo++ ; // hi-- ;  // additional else
                
            }
            
             return false ;
        }
        
       
        
    
}