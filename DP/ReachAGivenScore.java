//gfg
class Geeks {
    public long count(int n) {
        long[] table = new long[(int)n+1];
        Arrays.fill(table, 0);
        table[0] = 1;
        int i ; 
       for (i = 3; i <= n; i++)
            table[i] += table[i - 3];
        for (i = 5; i <= n; i++)
            table[i] += table[i - 5];
        for (i = 10; i <= n; i++)
            table[i] += table[i - 10];
     
        return table[n];
        
        
    }
}