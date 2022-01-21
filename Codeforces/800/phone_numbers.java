import java.util.* ; 
public class phone_numbers
{


    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in) ;

        int n = scn.nextInt() ;
        String s = scn.next() ;
      
        int eights = 0 ;
       
        for( int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i) ; 
            if(ch == '8' ){
                eights++ ; 
            }
        }
        
      if(eights >= n/11){
        
        System.out.println(n/11) ; 
    }
    else if(eights < n/11 && n > 11){
        System.out.println(eights) ;
    }
    else{
       System.out.println("0") ;
    }




    }
    
}