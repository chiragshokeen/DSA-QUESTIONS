public static ArrayList<ArrayList<String>> groupShiftedStrings(String[] strs) {
    // write your code here
    
    HashMap<String , ArrayList<String>> map  =new HashMap<>() ;
    
    for( int i = 0 ; i < strs.length ; i++ ){
        
        String s = strs[i] ;
        int n = s.length() ; 
        if( n == 1 ){
            if( map.containsKey("1") ){
                map.get("1").add(s) ;
            }else{
                map.put( "1" , new ArrayList<>() ) ;
                map.get("1").add(s) ; 
            }
            continue ;
        }  
        StringBuilder sb = new StringBuilder() ;
        for( int j = 1 ; j < n ; j++ ){
            //sb.append( ( (s.charAt(j) - s.charAt(j-1) ) %  26) ) ; 
            int k = s.charAt(j) - s.charAt(j-1) ;
            if(k < 0) k+=26 ; 
            sb.append(k+"#");
        }
        
        String diff = sb.toString() ;
        
        if(map.containsKey(diff) == false ){
            map.put( diff , new ArrayList<>() ) ;
            
        }
        
        map.get(diff).add(s) ;
        
    }
    

    ArrayList<ArrayList<String>> ans = new ArrayList<>() ;
    
    for( String key : map.keySet() ){
        ans.add( map.get(key) ) ; 
    }
    
    return ans ; 
}