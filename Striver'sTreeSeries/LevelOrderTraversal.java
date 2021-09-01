class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();   //make a queue
        List<List<Integer>> wrapList = new LinkedList<>(); // make a arrayList
        if(root == null){
            return wrapList;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            ArrayList<Integer> subList = new ArrayList<>();
            for(int i=0;i<level;i++){
                  Node current = queue.poll();
                   subList.add(current.val);
                for(Node child: current.children)
                    queue.offer(child);
                // if(queue.peek().children!=null) queue.offer(queue.peek().children);
                // if(queue.peek().right!=null) queue.offer(queue.peek().right);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
}
