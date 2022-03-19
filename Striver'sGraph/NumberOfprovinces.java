class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        boolean visited[] = new boolean[isConnected.length];
        int count = 0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                count++;
                dfs(isConnected,visited,i,isConnected.length);
            }
        }
        return count;
    }
    
    public void dfs(int[][] connected, boolean[] visited,int index, int n){
        visited[index] = true;
        for(int i=0;i<n;i++){
            if(connected[index][i] == 1 && !visited[i]){
                dfs(connected,visited,i,n);
            }
        }
    }
}