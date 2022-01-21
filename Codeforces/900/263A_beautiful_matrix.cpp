#include <bits/stdc++.h>

using namespace std;
#define REP(i,n) for(int i=0;i<(n);i++) 

int main()
{
  for(int i = 1 ; i <= 5 ; i++){
      for(int j = 1 ; j <= 5 ; j++){
          int x ; 
          cin>>x ;
          if(x == 1){
              cout<< abs(3-j) +abs(3-i) ; 
              
          }
      }
  }

    return 0;
}
