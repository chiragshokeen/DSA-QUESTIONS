//2145


class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int n = differences.length;
        long cum = 0;
        long min = 0, max = 0;
        int minDiff = Math.abs(differences[0]);
        
        for(int i = 0; i < n; i++) {
            cum += differences[i];
            if(min > cum)
                min = cum;
            if(max < cum)
                max = cum;
        }
        
        int diff = (int)(max - min);
        int ans = upper - lower + 1 - diff;
        return ans > 0 ? ans : 0;
    }
}