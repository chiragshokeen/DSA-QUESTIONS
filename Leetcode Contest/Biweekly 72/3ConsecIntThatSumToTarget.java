class Solution {
    public long[] sumOfThree(long num) {
        
        if(num%3 != 0 ) return new long[0] ; 
        
        long[] ans = new long[3] ;
        ans[1] = num/3 ;
        ans[0] = num/3-1;
        ans[2] = num/3+1 ;
        
        return ans ; 
        
    }
}