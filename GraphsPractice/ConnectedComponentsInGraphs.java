import java.util.ArrayList;
import java.util.Scanner;

public class ConnectedComponentsInGraphs {

	 static ArrayList<Integer> adjList[];
	 
	    static int numberOfCC(int V) {
	            int cc = 0;
	            boolean vis[] = new boolean[V+1];
	            for (int i = 1; i <= V; i++) {
	                if (!vis[i]) {
	                    DFSHelper(i, vis);
	                    cc++;
	                }
	            }
	            return cc;
	    }
	 
	    static void DFSHelper(int start, boolean vis[]) {
	            vis[start] = true;
	            for (int i = 0; i < adjList[start].size(); i++) {
	                int nextNode = adjList[start].get(i);
	                if (!vis[nextNode])
	                    DFSHelper(nextNode, vis);
	            }
	    }
	 
	    public static void main(String args[] ) throws Exception {
	        Scanner r = new Scanner(System.in);
	 
	        int n = r.nextInt();
	        int e = r.nextInt();
	 
	        adjList = new ArrayList[n+1];
	        for(int i = 0;i <= n;i++){
	            adjList[i] = new ArrayList<>();
	        }
	 
	        for(int i = 1;i <= e;i++){
	            int u = r.nextInt();
	            int v = r.nextInt();
	            adjList[u].add(v);
	            adjList[v].add(u);
	        }
	 
	        System.out.println(numberOfCC(n));
	        
	    }
	}