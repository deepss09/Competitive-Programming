class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int[][] dp = new int[dungeon.length][dungeon[0].length];
        return calculate(dungeon,0,0,dp);
    }
    private int calculate(int dungeon[][],int i,int j,int dp[][]){
        //base case
        if(i == dungeon.length-1 && j == dungeon[0].length-1){
            return dungeon[i][j] > 0 ? 1: -dungeon[i][j]+1;
        }
        if(dp[i][j] != 0)
            return dp[i][j];
        
        //last row
        if(i == dungeon.length-1){
            return dp[i][j] = Math.max(1,calculate(dungeon,i,j+1,dp)-dungeon[i][j]);
        }
        //last column
       if(j == dungeon[0].length-1){
           return dp[i][j] = Math.max(1,calculate(dungeon,i+1,j,dp)-dungeon[i][j]);
       }
        return dp[i][j] = Math.max(1,Math.min(calculate(dungeon,i+1,j,dp)-dungeon[i][j],calculate(dungeon,i,j+1,dp)-dungeon[i][j]));
    }
}