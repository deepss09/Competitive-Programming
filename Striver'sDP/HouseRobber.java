//Memoization
class Solution {
    public int rob1(int ind,int[] nums,int dp[]){
        if(ind == 0) return nums[ind];
        if(ind<0) return 0;
        if(dp[ind]!= -1) return dp[ind];
        
        int pick = nums[ind] + rob1(ind-2,nums,dp);
        int notpick = 0 + rob1(ind-1,nums,dp);
        
        return dp[ind] = Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return rob1(n-1,nums,dp);
    }
}

//Tabulation
static int solveUtil(int n, int[] arr, int[] dp){
    
    dp[0]= arr[0];
    
    for(int i=1 ;i<n; i++){
        int pick = arr[i];
        if(i>1)
            pick += dp[i-2];
        int nonPick = 0+ dp[i-1];
        
        dp[i]= Math.max(pick, nonPick);
    }
    
    
    return dp[n-1];
}

static int solve(int n, int[] arr){
    int dp[]=new int[n];
    Arrays.fill(dp,-1);
    return solveUtil(n, arr, dp);
}

//Space Optimization
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;
        for(int i=1;i<n;i++){
            int pick = nums[i];
            if(i>1)
            pick += prev2;
        int nonPick = 0 + prev;
        
        int cur_i = Math.max(pick, nonPick);
        prev2 = prev;
        prev= cur_i;
        
    }
    return prev;
        }
    }
