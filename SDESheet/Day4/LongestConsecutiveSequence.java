class Solution {
    public int longestConsecutive(int[] nums) {
        //optimized   //Time Complexity = O(N), Space = O(N)
        Set<Integer>hashSet = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }
        int longestStreak = 0;
        for(int num:nums){
            if(!hashSet.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
            
            while(hashSet.contains(currentNum+1)){
                currentNum+=1;
                currentStreak+=1;
            }
                longestStreak = Math.max(longestStreak,currentStreak);
        }
            
        }
        return longestStreak;
    } 
    }
        
//         int n = nums.length;
//         Arrays.sort(nums);
        
//         int mx = 0;
//         int count = 0;
//         for(int i=0;i<n;i++){
//               if(i>0 && nums[i] == nums[i-1]+1){
//                   count++;
//               }else if(i>0 && nums[i]==nums[i-1]){
//                   continue;
//               }else{
//                   count = 1;
//               }
//             mx = Math.max(mx,count);
//         }
//         return mx;
//     }
// }

//Time Complexity = O(NlogN)
//Space = O(1)