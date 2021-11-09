/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Pair{
    Node node;
    int line;
    public Pair(Node _node,int _line){
        node = _node;
        line = _line;
    }
}
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it = q.remove();
            int line = it.line;
            Node temp = it.node;
            if(map.get(line) == null) map.put(line,temp.data);
            if(temp.left!=null){
                q.add(new Pair(temp.left,line-1));
            }
            if(temp.right !=null){
                q.add(new Pair(temp.right,line+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}