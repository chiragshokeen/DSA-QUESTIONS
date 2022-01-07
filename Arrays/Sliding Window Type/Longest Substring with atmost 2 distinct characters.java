//leetcode 159
//abbaccaabbaaabbc
//output : 9
//Input: “eceba”

// Output: 3
// Explanation:
// T is "ece" which its length is 3.
//leetcode 340 -> k distinct characters

class solution{

    public int lengthOfLongestSubstringTwoDistinct(String s){


        int n  = s.length()  ;

        int[] map = new int[128] ;
        int distinctCount = 0 ; 
        
        int si = 0 ; 
        int ei = 0 ; 
        int len = 0 ; 

        while( ei < n  ){

            if(map[s.charAt(ei++)]++ == 0  ){
                distinctCount++ ; 
            }

            while( distinctCount > 2 ){

                if( map[s.charAt(si++)]-- == 1   ){
                    distinctCount-- ; 
                }

            }

            len = Math.max(len , ei-si) ; 



        }



        return len ; 



    }

}
