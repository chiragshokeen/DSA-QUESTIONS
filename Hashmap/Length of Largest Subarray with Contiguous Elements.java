//gfg

// Input:  arr[] = {10, 12, 11};
// Output: Length of the longest contiguous subarray is 3

// Input:  arr[] = {14, 12, 11, 20};
// Output: Length of the longest contiguous subarray is 2

// Input:  arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
// Output: Length of the longest contiguous subarray is 5

// O(n^2)
class solution{
int findLength(int arr[], int n)
    {
        int max_len = 1;  
        for (int i = 0; i < n - 1; i++) //consider all subarrays

        {
           
            int mn = arr[i], mx = arr[i];
 
            // Consider all subarrays starting with i and ending with j
            for (int j = i + 1; j < n; j++)
            {
                // Update min and max in this subarray if needed
                mn = min(mn, arr[j]);
                mx = max(mx, arr[j]);
 
                // If current subarray has all contiguous elements
                if ((mx - mn) == j - i) // this property is used
                    max_len = max(max_len, mx - mn + 1);
            }
        }
        return max_len;
    }
}