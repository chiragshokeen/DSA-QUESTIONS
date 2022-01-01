//leetcode 875
// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

// Return the minimum integer k such that she can eat all the bananas within h hours.

class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        
        
        Arrays.sort(piles ) ;
        int n = piles.length ; 
        int minspeed = 1 ;
        int maxspeed = piles[n-1] ;
        
        while(minspeed < maxspeed ){
            
            
            int mid = minspeed + (maxspeed - minspeed )/2 ;
            if(isPossibletoEat(piles , mid ) <= H ) maxspeed = mid ;
            else minspeed = mid + 1 ;
            
            
        }
        
        return minspeed ; 
        
    }
    
    public static int isPossibletoEat(int[] piles , int mid ){
        
        int count = 0 ;
        
        for(int i = 0 ; i < piles.length ; i++ ){
            
            if(piles[i] <= mid) count+=1 ;
            else{
                
                if(piles[i] %mid == 0 ) count+=(piles[i]/mid) ;
                else count+=(piles[i]/mid )+ 1 ; 
                
            }
            
        }
        return count ;
        
    }
}