class Solution
{
    Boolean isLeaf(Node root){
        return (root.left == null) && (root.right == null);
        }
        void addBoundaryLeft(Node root, ArrayList<Integer> res){
            Node curr = root.left;
            while(curr!=null){
            if(isLeaf(curr) == false) res.add(curr.data);
            if(curr.left!=null) curr = curr.left;
            else
            curr = curr.right;
        }
        }
        void addBoundaryRight(Node root, ArrayList<Integer> res){
            Node curr = root.right;
             ArrayList<Integer> list = new ArrayList<>();
             while(curr!=null){
                 if(isLeaf(curr) == false) list.add(curr.data);
                 if(curr.right!=null) curr = curr.right;
                 else
                 curr = curr.left;
             }
             int i;
             for(i=list.size()-1;i>=0;--i){
                 res.add(list.get(i));
             }
             
        }
        void leafNodes(Node root, ArrayList<Integer> res){
             if(isLeaf(root)){
                 res.add(root.data);
                 return;
             }
             if(root.left!=null) leafNodes(root.left,res);
             if(root.right!=null) leafNodes(root.right,res);
        }
	ArrayList <Integer> printBoundary(Node node)
	{
	        ArrayList<Integer> ans = new ArrayList<Integer>(); 
	    if(isLeaf(node) == false) ans.add(node.data); 
	    addBoundaryLeft(node, ans); 
	    leafNodes(node, ans); 
	    addBoundaryRight(node, ans); 
	    return ans;
	}
}
