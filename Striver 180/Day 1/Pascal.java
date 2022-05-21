import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        int n = numRows ;

        List<List<Integer>> ans = new ArrayList<>() ;

        
        for( int i = 0 ; i < n ; i++ ){
            
            List<Integer> small = new ArrayList<>() ;
            
            for( int j = 0 ; j <=i ; j++  ){
                
                if(j == 0 || j == i  ){
                    small.add(1) ;
                }else{
                    
                    small.add( ans.get(i-1).get(j-1) + ans.get(i-1).get(j)  ) ; 
                    
                }
                
            }
            
            ans.add(small) ;
            
            
        }
    
return ans ; 
  
    }

}

// class Solution {
//     public List<List<Integer>> generate(int numRows) {

//         int n = numRows ;

//         List<List<Integer>> ans = new ArrayList<>() ;

//         for( int i = 0 ; i < n ; i++ ){

//             List<List<Integer>> smallans = new ArrayList<>() ;

//             for( int j = 0 ; j <= i ; j++ ){

//                 int a = fact( i ) ;
//                 int b = fact( j ) ; 
//                 int c = fact( i-j ) ;

//                 smallans.add(int)( a/(b*c) ) ; 


//             }

//             ans.add( smallans ) ; 


//         }
        


//         return ans; 


        


        
//     }

//     public static int fact( int n ){


//         if(n == 0 || n == 1){
//             return 1 ;
//         }

//         return n * fact(n-1) ; 
    


//     }


// }