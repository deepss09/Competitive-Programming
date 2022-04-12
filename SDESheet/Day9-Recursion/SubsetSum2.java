class Solution {
    public void findSubsets(int ind,int nums[],List<Integer> ds,List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i] == nums[i-1]) continue; //if i is not at first index and it's a duplicate so we will continue e.g like [1,2,2,2] so we make a list of [1,2,2] but we don't add last 2 because it's a duplicate now
            
            ds.add(nums[i]); // otherwise add it
            findSubsets(i+1,nums,ds,ansList);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findSubsets(0,nums,new ArrayList<>(),ansList);
        return ansList;
    }
}
//Time Complexity : O(2N*N) in 2N , n is the power of 2
//Space = O(2n) * O(k)
//Auxilary Space = O(N)