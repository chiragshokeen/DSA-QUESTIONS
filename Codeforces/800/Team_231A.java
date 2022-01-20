import java.util.* ; 
public class Team_231A {

    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        int ans = 0 ; 
        int n = scn.nextInt();
        for( int i = 0 ; i < n ; i++ ){
            int count = 0 ; 
            for( int j = 0 ; j < 3 ; j++ ){
                int c = scn.nextInt() ;
                if(c == 1)count++ ; 
            }
            if(count>=2) ans++ ;
        }
      
        System.out.println(ans) ; 
    }
    
}
