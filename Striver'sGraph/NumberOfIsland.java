class Solution {
    public int numIslands(char[][] grid) {
        int numIsland = 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j] == '1'){
                    numIsland++;
                    dfs(grid,i,j);
                }
            }
        }
        return numIsland;
    }

public void dfs(char[][]grid,int i,int j){
    if(grid[i][j]=='0'||grid[i][j]=='2')
            return;
        
        grid[i][j] = '2';
        
        if(i-1>=0)dfs(grid,i-1,j);
        if(i+1<grid.length)dfs(grid,i+1,j);
        if(j-1>=0)dfs(grid,i,j-1);
        if(j+1<grid[0].length)dfs(grid,i,j+1);
}
}