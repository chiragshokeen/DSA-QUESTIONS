//leetcode 2129

// Example 1:

// Input: title = "capiTalIze tHe titLe"
// Output: "Capitalize The Title"
// Explanation:
// Since all the words have a length of at least 3, the first letter of each word is uppercase, and the remaining letters are lowercase.
// Example 2:

// Input: title = "First leTTeR of EACH Word"
// Output: "First Letter of Each Word"
// Explanation:
// The word "of" has length 2, so it is all lowercase.
// The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.


class Solution {
    public String capitalizeTitle(String title) {
        
        String words[]= title.split("\\s");
        String ans=""; 
        int n = words.length ;
        int count = 0 ; 
        for( String w : words ){
            
            if( w.length() <=2 ){
                if(count<n-1){
                    ans+=w.toLowerCase()+" "; 
                }else{
                    ans+=w.toLowerCase(); 
                }
               
                
                
            }else{
                
                 String first=w.substring(0,1);  
                String afterfirst=w.substring(1);  
                if( count < n-1  ){
                ans+=first.toUpperCase()+afterfirst.toLowerCase()+" ";  
                }
                else{
                    ans+=first.toUpperCase()+afterfirst.toLowerCase() ; 
                }
                
                
            }
            count++ ; 
            
        }
        
        
        return ans ; 
    }
}