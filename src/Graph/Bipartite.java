package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
    //using bfs
    //time complexity :O(V+E)
    //Space: O(V)
    private boolean bfs(int[][] graph){
        int[] vis=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(vis[i]!=0) continue;
            Queue<Integer> q=new LinkedList<Integer>();
            q.add(i);
            vis[i]=1;
            while(!q.isEmpty()){
                int rem=q.poll();

                for (int next : graph[rem]) {
                    if (vis[next] == 0) {
                        vis[next] = -vis[rem];
                        q.offer(next);
                    } else if (vis[next] != -vis[rem]) {
                        return false;
                    }
                }

            }
        }

        return true;
    }
    //using dfs
    //Time:  O(V + 2E)
    //Space: O(3V)
    private boolean dfs(int node, int col, int[] color,
                        ArrayList<ArrayList<Integer>>adj) {

        color[node] = col;

        // traverse adjacent nodes
        for(int it : adj.get(node)) {
            // if uncoloured
            if(color[it] == -1) {
                if(!dfs(it, 1 - col, color, adj)) return false;
            }
            // if previously coloured and have the same colour
            else if(color[it] == col) {
                return false;
            }
        }

        return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int[] color = new int[V];
        Arrays.fill(color, -1);

        // for connected components
        for(int i = 0;i<V;i++) {
            if(color[i] == -1) {
                if(!dfs(i, 0, color, adj)) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        Bipartite obj = new Bipartite();
        boolean ans = obj.isBipartite(4, adj);
        System.out.println(ans);
    }
}
