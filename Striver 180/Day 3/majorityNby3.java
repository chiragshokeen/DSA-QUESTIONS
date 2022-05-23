class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        
        int num1 = -1;
        int num2 = -1;
        
        int count1 = 0 ; 
        int count2 = 0 ;
        
        for(int ele : nums){
            
            if(ele == num1){
                count1++ ; 
            }  else if( ele == num2 ){
                count2++; 
            }else if(count1 == 0  ){
                num1 = ele ;
                count1++ ; 
            }else if( count2 == 0 ){
                num2 = ele ; 
                count2++ ; 
            }else{
                count1-- ; 
                count2-- ; 
            }
            
            
        }
        
        
        List<Integer> ans = new ArrayList<>() ;
        int c1 = 0  ;
        int c2 = 0 ;
        for( int i = 0 ;i < nums.length ; i++ ){
            
            if( nums[i] == num1 ){
                c1++ ; 
            } 
           else if( nums[i] == num2 ){
                c2++ ; 
            }
            
        }
        
        if( c1 > n/3 ){
            ans.add(num1) ;
        }
        if( c2 > n/3 ){
            ans.add(num2) ;
        }
        
        return ans;
        
    }
}