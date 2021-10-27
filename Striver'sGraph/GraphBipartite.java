class Solution {
    public boolean isBipartite(int[][] graph) {
       int n= graph.length;
        int colors[] = new int[n];
        for(int i=0;i<n;i++){
            if(colors[i] == 0){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                colors[i] = 1;
                
                while(!q.isEmpty()){
                    int cur = q.poll();
                    for(int j: graph[cur] ){
                        if(colors[j] == 0){
                            colors[j] = -colors[cur];
                            q.add(j);
                        }
                        else if(colors[j] == colors[cur]){
                            return false;
                        }
                    }
                }
               
            }
             
        }
        return true;
    }
}
