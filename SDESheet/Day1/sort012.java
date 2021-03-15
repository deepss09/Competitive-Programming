class Solution {
    public void sortColors(int[] nums) {
       int low = 0;
        int hi = nums.length-1;
            int mid = 0;
        while(mid<=hi){
            //if element is 0
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            //if element is 2
            else if(nums[mid] == 2){
                int temp = nums[hi];
                nums[hi] = nums[mid];
                nums[mid] = temp;
                hi--;
            }
            //if element is 1
            else{
                mid++;
            }
            }
        }
}