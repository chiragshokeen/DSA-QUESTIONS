class Solution {
public:
    long long maximumImportance(int n, vector<vector<int>>& roads) {
        vector<long long>v(n);
       
        int sizeroad=roads.size();
       
        for(int i=0;i<sizeroad;i++)
        {
           int a=roads[i][0];
           
            int b=roads[i][1];
           
            v[a]++;
           
            v[b]++;
         }
        
        
        sort(v.begin(),v.end());
       
        long long answer=0;
        int imp=1;
        for(long long p: v)
        {
        answer+=p*imp;
            imp+=1;
           
        }
        return answer;
    }
};