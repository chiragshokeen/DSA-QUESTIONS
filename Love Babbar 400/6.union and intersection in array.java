//union using set

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> set = new HashSet<>() ;
        
        
        for( int i : a ){
            set.add(i) ;
        }
        
        for(int i : b){
            set.add(i) ;
        }
        
        return set.size() ; 
        
    }
}

//intersection using hashmap

//store both arrays in a single hashmap and print the numbers with freq > 2

class Solution{

    public static int doIntersection(int[] a , int[] b){

        HashMap<Integer , Integer> map = new HashMap<>() ;

        for( int i : a ){

            map.put( i , map.getOrDefault( i , 0 )+1 ) ; 

        }

        for( int i : b ){

            map.put( i , map.getOrDefault( i , 0 )+1 ) ; 

        }

        int ans = 0 ; 
        for(int k : map.keySet()){
            if(map.get(k) >= 2){
                ans++ ; 
            }
        }

        return ans;

    }


}