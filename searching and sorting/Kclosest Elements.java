//leetcode 658
// Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

// An integer a is closer to x than an integer b if:

// |a - x| < |b - x|, or
// |a - x| == |b - x| and a < b


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class solution{

    public List<Integer> findclosestElements(int[] A, int k, int x){


        ArrayList<Integer> arr = new ArrayList<>() ;

        for(int val : A){
            arr.add(val) ; 
        }

        if( x <= A[0] ){
            return arr.subList(0,k ) ; 
        }else if( x>=A[n-1] ){
            return arr.subList(n-k, n);
        }else{

            int idx = Collections.binarySearch(arr, x) ;
            if(idx < 0) idx = -idx-1 ; 


            int si = Math.min(0 , idx - k) ;
            int ei = Math.max(n-1 , idx + k) ; 

            while( ei-si+1 > k ){

                if( x - A[si] > A[ei] - x ) si++;
                else{
                    ei-- ; 
                }



            }


        }


        return arr.subList(si, ei+1) ; 

    }




}