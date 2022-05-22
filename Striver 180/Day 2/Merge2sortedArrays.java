import java.util.Arrays;

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
         int i = 0, j = 0;
        n--;
        
        while(i<=n && j<m){
            
            if(arr1[i]<arr2[j])
                i++;
            else {
                long temp = arr1[n];
                arr1[n] = arr2[j];
                arr2[j] = temp;
                n--;
                j++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // code here 
    }
}