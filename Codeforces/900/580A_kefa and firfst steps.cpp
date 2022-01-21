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
  int len = 1 ;
  int max = 1 ; 
  
  for(int i=1;i<(n);i++) {
      
      if( arr[i] >= arr[i-1] ){
          len++ ; 
      }
      
      else{
          
          if( max < len ){
              max=  len ; 
          }
          len = 1 ; 
        
      }
       
  }
     if (max < len)
            max = len;
  cout<<max ; 

    return 0;
}