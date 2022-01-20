import java.util.* ;
 
public class way_to_long_words_72A{
    
    
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        for( int i = 0 ; i < n ; i++ ){
            
            String s = scn.next() ;
            int len = s.length() ;
            if(len>10){
            String ans = s.charAt(0)+""+(len-2) + s.charAt(len-1) ;
            
            System.out.println(ans) ; 
            }
            else{
                System.out.println(s) ; 
            }
            
            
        }
        
        
    }
    
}