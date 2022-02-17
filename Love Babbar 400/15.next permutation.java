class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length ;
        if( n==1 ) return ; 
        int i = n-2 ;
        int flag = 0 ; 
        while( i >= 0 ){
            
            if(nums[i] >= nums[i+1] ){
                
            }else{
                
                for( int j = n-1 ; j > i ; j-- ){
                    
                    if( nums[j] > nums[i] ){
                        
                        int temp = nums[i] ;
                        nums[i] = nums[j] ;
                        nums[j] = temp ;
                        flag = 1;
                        break;
                        
                    }
                    
                }
                
                reverse( nums , i+1 , n-1 ) ; 
                
                if( flag ==1 ){
                    break ;
                }
                
            }
            
            i-- ; 
        }
        
        
        if( flag == 0 ){
            Arrays.sort(nums ) ; 
        }
        
        
        return;
    }
    
    public void reverse( int[] arr , int left , int right ){
        
        while( left < right ){
            int temp = arr[left] ;
            arr[left ] = arr[right] ;
            arr[right] = temp ;
            
            left++ ; 
            right-- ; 
        }
        
    }
    
}