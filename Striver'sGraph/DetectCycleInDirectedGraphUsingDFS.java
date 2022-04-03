class Solution {
    // Function to detect cycle in a directed graph.
    private boolean checkCycle(int node, ArrayList<ArrayList<Integer>>adj,int vis[],int dfsVis[]){
          vis[node] = 1; 
        dfsVis[node] = 1; 
        
        for(Integer it: adj.get(node)) {
            if(vis[it] == 0) {
                if(checkCycle(it, adj, vis, dfsVis) == true) {
                    return true; 
                }
            } else if(dfsVis[it] == 1) {
                return true; 
            }
        }
        dfsVis[node] = 0;
        return false; 
    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[] = new int[V];
        int dfsVis[] = new int[V];
        
        for(int i=0;i<V;i++){
            if(vis[i] == 0){
            if(checkCycle(i,adj,vis,dfsVis) == true) return true;
        }
        }
        return false;
    }
}