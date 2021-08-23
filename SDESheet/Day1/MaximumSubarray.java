class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];  //first element of array 
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum > max) max = sum;  
            if(sum < 0) sum = 0; // if element is negative then it is 0
        }
        return max;
    }
}