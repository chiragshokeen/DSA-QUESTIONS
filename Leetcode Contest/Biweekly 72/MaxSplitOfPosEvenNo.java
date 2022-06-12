class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
         if(finalSum % 2 != 0) return new ArrayList<>();
         
         long sum = 0 ; 
         ArrayList<Long> ans = new ArrayList<>();
         
         for(long i = 2 ; sum < finalSum; i += 2){
             sum += i;
             ans.add(i);
         }
         
       
         if(sum == finalSum) return ans;
         
         long extraSum = sum - finalSum;
         
         ArrayList<Long> finalAns = new ArrayList<>();
         for(int i = 0 ; i < ans.size(); i++){
             if(ans.get(i) == extraSum) continue;
             else{
                 finalAns.add(ans.get(i));
             }
         }
         
         return finalAns;
     }
 }