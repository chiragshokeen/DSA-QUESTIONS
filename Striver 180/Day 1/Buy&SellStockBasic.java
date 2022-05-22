class Solution {
    public int maxProfit(int[] prices) {
        
        //lsf = least so far
        //pisf = profit so far
        //op = overall max profit
        int lsf = Integer.MAX_VALUE ;
        int pisf = 0 ;
        int op = 0 ;
        
        for(int i = 0 ; i < prices.length ; i++ ){
            if(prices[i] < lsf ){
                lsf = prices[i] ;
            }
            
            pisf = prices[i] - lsf ; //calculate profit
            if(pisf>op ){
                op = pisf ;
            }
            
        }
        
        return op;
        
    }
}