//Recursive Code
public class Solution {
    public static int jump(int n,int heights[]){
        if(n ==0) return 0;
        int left = jump(n-1,heights)+Math.abs(heights[n]-heights[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1)
            right = jump(n-2,heights)+Math.abs(heights[n]-heights[n-2]);
        return Math.min(left,right);
    }
    public static int frogJump(int n, int heights[]) {
        return jump(n-1,heights);
        // Write your code here..
    }

}

//Memoization(Top-Down)
import java.util.*;
public class Solution {
    public static int jump(int n,int heights[],int dp[]){
        if(n ==0) return 0;
        if(dp[n]!= -1) return dp[n];
        int left = jump(n-1,heights,dp)+Math.abs(heights[n]-heights[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1)
            right = jump(n-2,heights,dp)+Math.abs(heights[n]-heights[n-2]);
        return dp[n] = Math.min(left,right);
    }
    public static int frogJump(int n, int heights[]) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return jump(n-1,heights,dp);
        // Write your code here..
    }

}

//Tabulation
import java.util.*;
public class Solution {
    public static int frogJump(int n, int height[]) {
        
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        dp[0]=0;
  for(int i=1;i<n;i++){
      int jumpTwo = Integer.MAX_VALUE;
        int jumpOne= dp[i-1] + Math.abs(height[i]-height[i-1]);
        if(i>1)
            jumpTwo = dp[i-2] + Math.abs(height[i]-height[i-2]);
    
        dp[i]=Math.min(jumpOne, jumpTwo);
  }
//         return jump(n-1,heights,dp);
        // Write your code here..
        return dp[n-1];
    }
}
