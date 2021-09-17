class Solution {
    public int maxPathSum(TreeNode root) {
        int maxVal[] = new int[1];
        maxVal[0] = Integer.MIN_VALUE;
        sum(root,maxVal);
        return maxVal[0];
    }
    
    public int sum(TreeNode root, int maxVal[]){
        if(root == null) return 0;
        
        int leftS = Math.max(0,sum(root.left,maxVal)); // 0 return if path is negative
        int rightS = Math.max(0,sum(root.right, maxVal));
        maxVal[0] = Math.max(maxVal[0],leftS+rightS+root.val);
        
        return root.val+Math.max(leftS,rightS);
    }
}