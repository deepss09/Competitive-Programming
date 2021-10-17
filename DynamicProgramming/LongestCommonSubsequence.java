//Recursion
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
       return lcs(text1,text2,text1.length(),text2.length());
    }
 public int lcs(String text1, String text2,int n,int m) {
        if(n == 0 || m == 0){
            return 0;
        }
        if(text1.charAt(n-1) == text2.charAt(m-1)){
            return 1+ lcs(text1,text2,n-1,m-1);
        }
     else{
         return Math.max(lcs(text1,text2,n-1,m),lcs(text1,text2,n,m-1));
     }
 }
}

//Memoization
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n+1][m+1];
       return lcs(text1,text2,text1.length(),text2.length(),dp);
    }
 public int lcs(String text1, String text2,int n,int m,int dp[][]) {
        if(n == 0 || m == 0){
            return 0;
        }
     if(dp[n][m]!=0){
         return dp[n][m];
     }
        if(text1.charAt(n-1) == text2.charAt(m-1)){
            return dp[n][m] =  1+ lcs(text1,text2,n-1,m-1,dp);
        }
     else{
         return dp[n][m] =  Math.max(lcs(text1,text2,n-1,m,dp),lcs(text1,text2,n,m-1,dp));
     }
 }
}

//DP
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        // int dp[][] = new int[n+1][m+1];
       return lcs(text1,text2,text1.length(),text2.length());
    }
 public int lcs(String text1, String text2,int n,int m) {
        if(n == 0 || m == 0){
            return 0;
        }
     int dp[][] = new int[n+1][m+1];
     for(int i=0;i<n+1;i++){
         for(int j=0;j<m+1;j++){
             if(i == 0 || j == 0){
                 dp[i][j] = 0;
             }
         }
     }
     for(int i=1;i<n+1;i++){
         for(int j=1;j<m+1;j++){
             if(text1.charAt(i-1) == text2.charAt(j-1)){
                 dp[i][j] = 1+ dp[i-1][j-1];
             }else{
                 dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
             }
         }
     }
     return dp[n][m];
 }
}