//leetcode 128
// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

class Solution {
    public int longestConsecutive(int[] nums) {
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int ele : nums) map.put(ele,1);
     
     int len = 0;
     for(int ele : nums){
         if(!map.containsKey(ele)) continue;
 
         map.remove(ele);
         int prev = ele - 1;
         int next = ele + 1;
 
         while(map.containsKey(prev)){
             map.remove(prev); prev--;
         }
 
         while(map.containsKey(next)){
             map.remove(next); next++;
         }
 
         len = Math.max(len, next - prev - 1);
     }
 
     return len;
 }
 }