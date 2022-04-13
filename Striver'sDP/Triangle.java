//Recursion
class Solution {
    public int miniPath(int i,int j,List<List<Integer>> triangle){
        if(i == triangle.size()-1 ) return triangle.get(i).get(j); //if it is in the end row
        
        int top = triangle.get(i).get(j)+miniPath(i+1,j,triangle); //row increases
        int bottom = triangle.get(i).get(j)+miniPath(i+1,j+1,triangle); //row and col both increases
        return Math.min(top,bottom);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        return miniPath(0,0,triangle);
    }
}
//memoization
class Solution {
    public int miniPath(int i,int j,List<List<Integer>> triangle,int dp[][]){
        if(i == triangle.size()-1 ) return triangle.get(i).get(j); //if it is in the end row
        
        if(dp[i][j]!= -1) return dp[i][j];
        int top = triangle.get(i).get(j)+miniPath(i+1,j,triangle,dp); //row increases
        int bottom = triangle.get(i).get(j)+miniPath(i+1,j+1,triangle,dp); //row and col both increases
        return dp[i][j] = Math.min(top,bottom);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.get(n-1).size();
        int dp[][] = new int[m][n];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return miniPath(0,0,triangle,dp);
    }
}
//Tabulation
  public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.get(n-1).size();
        int dp[][] = new int[m][n];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
     for(int j=0;j<n;j++){
         dp[n-1][j] = triangle.get(n-1).get(j);
     }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int top = triangle.get(i).get(j)+dp[i+1][j];
                int down = triangle.get(i).get(j)+dp[i+1][j+1];
                dp[i][j] = Math.min(top,down);
            }
        }
        return dp[0][0];
    }
}