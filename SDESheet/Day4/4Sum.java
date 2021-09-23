class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return res;
        }
        int n = nums.length;
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                //remaining target
                //2 2 2    2 2 target = 8 so 8-2-2 = 4 remaining is 4
                //i j left   right next to j is left pointer
                int target_2 = target - nums[i]-nums[j];
                
                int left = j+1; // point to next j
                int right = n-1; // last index
                
                while(left<right){
                    //2 + 2 is 4
                    int sum = nums[left]+nums[right];
                    
                    if(sum < target_2) left++;
                    
                    else if(sum > target_2) right--;
                else{
                    List<Integer> quad = new ArrayList<>();
                    quad.add(nums[i]); //0
                    quad.add(nums[j]); //1
                    quad.add(nums[left]); // 2
                    quad.add(nums[right]);//3
                    res.add(quad);
                    //quad.get(2) because left position is 2
                    //processing the number of duplicates at 3
                    while(left<right && nums[left] == quad.get(2)) ++left;
                    
                    //provcessing the number of duplicates at 4
                    while(left<right && nums[right] == quad.get(3)) --right;
                }
            }
                //duplicates of number 2
                while(j+1<n && nums[j+1] == nums[j]) ++j;
        }
            //duplicates of number 1
            while(i+1<n && nums[i+1] == nums[i]) ++i;
       
    }
       return res; 
}
}
//Time Complexity = O(n3)
//Space = O(1)