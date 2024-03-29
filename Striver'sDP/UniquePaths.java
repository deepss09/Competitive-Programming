class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
	   dp[0][0] = 1;
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i==0 || j==0)
            {
                dp[i][j] = 1; // because of only one direction
            }
            else
            {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];  // we can move in both down and right directions
            }
        }
    }
    
    return dp[m-1][n-1];
    }
}