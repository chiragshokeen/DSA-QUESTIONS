class Solution
{
    long sumoflength(long arr[] ,int n)
    {

         // For maintaining distinct elements.
        Set<Long> s = new HashSet<>();
 
        // Initialize ending point and result
        int j = 0;
        long ans = 0;
 
        // Fix starting point
        for (int i = 0; i < n; i++)
        {
            while (j < n && !s.contains(arr[j]))
            {
                s.add(arr[j]);
                j++;
            }
 
            // Calculating and adding all possible length
            // subarrays in arr[i..j]
            ans += ((j - i) * (j - i + 1)) / 2;
 
            // Remove arr[i] as we pick new starting point
            // from next
            s.remove(arr[i]);
        }
 
        return ans;

    }
}