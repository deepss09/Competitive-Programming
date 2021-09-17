class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        
        if(root == null) return list;
        
        queue.offer(root);
        boolean lefttoright = true;
        while(!queue.isEmpty()){
            int levelnum = queue.size();
            List<Integer> sublist = new ArrayList<>(levelnum);
            for(int i=0;i<levelnum;i++){
                int index = i;
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right !=null) queue.offer(queue.peek().right);
                if(lefttoright == true) sublist.add(queue.poll().val);
                else sublist.add(0,queue.poll().val);
            }
            lefttoright = !lefttoright;
            list.add(sublist);
        }
        return list;
    }
}