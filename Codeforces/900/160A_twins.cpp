#include <bits/stdc++.h>

using namespace std;
#define REP(i,n) for(int i=0;i<(n);i++) 

int main()
{
  int n ;
  cin>>n ;
  int arr[n] ;
  
  REP(i,n){
      cin>>arr[i] ;
  }
  
   sort(arr, arr + n, greater<int>());
   int total =0 ;
   REP(i,n){
       total+=arr[i] ;
   }
   int count = 0;
   int sum = 0 ; 
   REP(i,n){
       sum+=arr[i];
       count++ ; 
       if( sum> total/2 ){
           cout<<count ;
           break;
       }
   }
  

    return 0;
}