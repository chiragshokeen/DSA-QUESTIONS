//gfg 


class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        if(n == 0 ) return 0 ; 
        for( int i = 1 ; i < n ; i++ ){

            a[i] = a[i]+a[i-1] ;

        }

        for( int i = 0 ; i < n ; i++ ){
            a[i] = (a[i] % k +k)%k;  // this is the main point to check
        }
    

        HashMap<Integer , Integer> map = new HashMap<>() ;
        map.put(0,-1) ;  // and this also because of including the starting index
        int len = 0 ;

        for(int i = 0 ; i < n ; i++){
            int val = a[i] ;
            if( map.containsKey(val) ){

                int si = map.get(val) ;
                len = Math.max(len , i-si) ; 


            }else{
                map.put(val , i) ; 
            }

        }

        return len ; 

    }
 
}