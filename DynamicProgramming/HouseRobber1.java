class Solution {
    public int rob(int[] nums) {
      if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int len = nums.length; 
        int dp[]= new int[len];
        //if only one element
        dp[0] = nums[0];
        
        //if nums is 2,7,9,3,1
        //2,7 so max will be considered
        dp[1] = Math.max(nums[1],dp[0]);
        for(int i=2;i<len;i++){
            //current money 9 so it will add 7 or 2 but 7 is adjacent so it will not add
            //so 9+2 = 11
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[len-1];
    }
}
    