class Solution {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        
        Arrays.sort( tiles , (a,b)-> a[0]-b[0]  ) ; 
        
        int n = tiles.length;
        int ans = 0 ; 
        
        int[] arr = new int[n] ;
        
        //prefix  sum array
        for( int i = 0 ; i < n ; i++ ){
            
            arr[i] = tiles[i][1]-tiles[i][0] + 1;
            if(i>0){
                arr[i]+=arr[i-1];
            }
            
        }
        
       
        
        for( int i = 0 ; i < n ; i++ ){
            
            int leftbound = tiles[i][0] ; 
            int rightbound = tiles[i][0] + carpetLen- 1;
            
            //binary search for checking how many fully covered
            int l = i ; 
            int r = n-1;
            int left = i ;
            int right = i-1;
            
            while(l<=r){
                int mid = (l+r)/2;
                if( tiles[mid][1] <= rightbound ){
                    right=mid;
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
            
            
            //if right found then add from prefix sum
            int curr = 0 ; //abhi ka ans
            if( right != i-1 ){
                curr+=arr[right];
                if(left > 0){
                    curr-=arr[left-1] ;
                }
            }
            
            //jo last wala adhura hoga wo calculate
            
            if(right + 1 < n){
                curr += Math.max(0 , rightbound - tiles[right+1][0] + 1) ; 
            }
            
            ans = Math.max(curr , ans); 
            
            
        }
        return ans;
        
    }
}