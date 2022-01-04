//leetcode 774

public class Solution {
   
    public double minmaxGasDist(int[] arr, int K) {
        // Write your code here
        
        double lo = 0.0 , hi = 1e9 , mid = 0.0 ;
        
        while((hi - lo) >= 1e-5 ){
            
            mid = lo + (hi - lo )/2.0 ; 
            
            if(checkisvalid(arr , mid , K ) ) lo = mid ;
            else hi = mid ; 
            
        }
        
        return mid ; 
        
        
    }
    public boolean checkisvalid(int[] arr , double mid , int K){
        
        int count = 0 ;
        for(int i= 1 ; i  <arr.length ; i++ ){
            
            count += (int)((arr[i] - arr[i-1]) / mid) ; 
            if(count > K) return true ;
            
        }
        return false;
    }
}