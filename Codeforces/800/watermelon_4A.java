import java.util.* ;
 
public class watermelon_4A{
    
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in) ; 
        int n = scn.nextInt() ;
        if( n > 2 ){
        if( n % 2 == 0  ){
            System.out.print("YES") ; 
        }else{
            System.out.print("NO") ; 
        }
        }
        
        else{
            System.out.println("NO") ; 
        }
        
        
    }
    
    
}