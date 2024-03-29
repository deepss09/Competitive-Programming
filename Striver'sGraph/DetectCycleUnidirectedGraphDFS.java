class Solution {
    // Function to detect cycle in an undirected graph
     public boolean checkCycle(int node,int parent,boolean vis[], ArrayList<ArrayList<Integer>> adj) {
      vis[node] = true; 
        for(Integer it: adj.get(node)) {
            if(vis[it] == false) {
                if(checkCycle(it, node, vis, adj) == true) 
                    return true; 
            }
            else if(it!=parent) 
                return true; 
        }
        
        return false; 
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        
        for(int i = 0;i<V;i++) {
            if(vis[i] == false) {
                if(checkCycle(i, -1, vis, adj))
                    return true; 
            }
        }
        
        return false; 
    }
}