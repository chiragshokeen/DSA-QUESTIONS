#include <bits/stdc++.h>

using namespace std;
#define REP(i,n) for(int i=0;i<(n);i++) 

int main()
{
 
    int n , t ;
    string s ;
    cin>>n >>t ;
    cin>>s ;
    REP(i , t){
        
        for( int j = 0 ; j < n-1 ; j++ )
        {
        if( s[j] == 'B' && s[j+1] == 'G' ){
            s[j] ='G' ;
            s[j+1] = 'B' ; 
            j++ ; 
        }
        
     }
        
        
    }
    
    cout<<s ; 

    return 0;
}
