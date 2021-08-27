class Solution {
    public int findDuplicate(int[] nums) {
       int slow = nums[0];   //initialize first element as slow and fast
        int fast = nums[0];
        do{
            slow = nums[slow]; // slow pointer move by 1
            fast = nums[nums[fast]];  // fast pointer movw by 2
        }
        while(slow != fast);
            fast = nums[0];
            while(slow != fast){
                slow = nums[slow];
                fast = nums[fast];
            }
            return slow;
        }
    }
