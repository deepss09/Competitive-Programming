class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public void dfs(int node,boolean[]vis,ArrayList<ArrayList<Integer>>adj,ArrayList<Integer>store){
        store.add(node);
        vis[node] = true;
        for(Integer it: adj.get(node)){
            if(!vis[it])
            dfs(it,vis,adj,store);
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> store = new ArrayList<>();
        boolean vis[] = new boolean[V+1];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(i,vis,adj,store);
            }
        }
        return store;
    }
}