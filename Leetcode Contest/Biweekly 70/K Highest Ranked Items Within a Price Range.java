//2146

class Solution {
    
    static class Pair{
        int row ,col , price,dist ;
        Pair( int row , int col , int price , int dist ){
            this.row = row ;
            this.col = col ; 
            this.price = price;
            this.dist = dist ;
        }
    }
    
    static class Cell{
        int row , col , dist ;
        Cell(int row , int col , int dist){
            this.row = row ;
            this.col = col ; 
            this.dist = dist ; 
        }
    }
    
    public List<List<Integer>> highestRankedKItems(int[][] grid, int[] pricing, int[] start, int k) {
        
        int m = grid.length ; 
        int n = grid[0].length ;
        int[] dx ={-1,0,0,1} ;
        int[] dy = {0,-1,1,0} ;
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1,p2)->{
            if( p1.dist != p2.dist ) return p1.dist-p2.dist ;
            if( p1.price != p2.price ) return p1.price-p2.price ;
            if( p1.row != p2.row ) return p1.row-p2.row ;
            return p1.col - p2.col ; 
        } ) ;
        
        boolean[][] vis = new boolean[m][n] ;
        vis[start[0]][start[1]] = true ;
        
        Queue<Cell> q1 = new LinkedList<>() ;
        q1.add( new Cell(start[0] , start[1] , 0) ) ;
        
        while( !q1.isEmpty() ){
            Cell c = q1.poll() ;
            for( int i = 0 ; i < 4 ; i++ ){
                int x1 = c.row + dx[i],y1 = c.col + dy[i];
                if( x1<0 || x1>=m || y1< 0 || y1>= n )continue;
                if( grid[x1][y1] == 0 || vis[x1][y1] ) continue;
                vis[x1][y1] = true;
                q1.add( new Cell(x1,y1,c.dist+1) ) ;
                
                
            }
            
            
            if( grid[c.row][c.col] >= pricing[0] && grid[c.row][c.col] <= pricing[1] && grid[c.row][c.col]>1 ){
                pq.add( new Pair(c.row , c.col , grid[c.row][c.col] , c.dist) ) ; 
 
            }
     
        }
        
          List<List<Integer>> ans = new ArrayList<>() ;
            while( k > 0 && !pq.isEmpty() ){
                Pair p = pq.poll() ; 
                List<Integer> a1 = new ArrayList<>() ;
                a1.add(p.row) ;
                a1.add(p.col) ;
                ans.add(a1) ;
                k-- ;
                
            }
            
            return ans ; 
            
 
    }
}