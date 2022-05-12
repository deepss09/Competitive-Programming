class Solution {
    public int f(int i,int j1,int j2,int n,int m,int grid[][],int dp[][][]){
        //out of bound case
        if(j1<0 || j2<0 || j1>=m || j2>=m)
            return (int)(Math.pow(-10,9));
        //destination
        //When i == N-1, it means we are at the last row, so we need to return from here. Now it can happen that at the last row, both robot1 and robot2 are at the same cell, in this condition we will return only cherries collected by robot1,
        if(i == n-1){
            if(j1 == j2)
                return grid[i][j1];
            else
                return grid[i][j1]+grid[i][j2]; //otherwise sum all the cherries
        }
        if(dp[i][j1][j2]!=-1){
            return dp[i][j1][j2];
        }
        int maxi = Integer.MIN_VALUE;
        for(int dj1 = -1;dj1<= +1;dj1++){ // there are 9combinations robot1 has 3moves and robot2 has 3moves both are moving simultaneously so 3*3 = 9;
            for(int dj2 = -1;dj2<= +1;dj2++){
                int value = 0;
                if(j1==j2)
                value = grid[i][j1]+f(i+1,dj1+j1,dj2+j2,n,m,grid,dp); // if both are in the same column so we take cherries of robot1 because we don't want to add doubly cherries
                else
                    value = grid[i][j1]+grid[i][j2]+f(i+1,dj1+j1,dj2+j2,n,m,grid,dp); //otherwise sum up the cherries
                maxi = Math.max(maxi,value);
            }
            
        }
        return dp[i][j1][j2] = maxi;
    }
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][][] = new int[n][m][m];

    for (int row1[][]: dp) {
      for (int row2[]: row1) {
        Arrays.fill(row2, -1);
      }
    }

    return f(0, 0, m -1, n, m, grid, dp);
  }
    }
