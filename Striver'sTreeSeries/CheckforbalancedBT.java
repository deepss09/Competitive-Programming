class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    public int height(TreeNode root){
        if(root == null)
            return 0;
        
        int leftheight = height(root.left);
        if(leftheight == -1) return -1;
        int rightheight = height(root.right);
        if(rightheight == -1) return -1;
        
        if(Math.abs(leftheight - rightheight)>1) return -1;
        
        return Math.max(leftheight,rightheight)+1;
    }
}