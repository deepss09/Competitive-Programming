class Solution {
    private void findCombination (int ind,int []arr,int target,List<List<Integer>>ans,List<Integer>ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i > ind && arr[i] == arr[i-1]) continue; //for repeating elements second or third time
            if(arr[i] > target) break;
            
            ds.add(arr[i]);
            findCombination(i+1,arr,target-arr[i],ans,ds); //recursion called
            ds.remove(ds.size()-1); //if once element added remove it after that
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}

//TC = 2 power n * k
//SC = K*x