package Graph;

import Arrays.PrintSolution;

import java.util.ArrayList;
import java.util.Stack;


//https://www.geeksforgeeks.org/problems/topological-sort/1
public class TopologicalSortUsingDFS {

    //stack
    //space: O(n)+O(n)
    //time: O(N+E);
    public void buildStack(int node, ArrayList<ArrayList<Integer>> adj,boolean[] vis, Stack<Integer> st){
        vis[node]=true;

        for(int child:adj.get(node)){
            if(!vis[child]){
                buildStack(child,adj,vis,st);

            }
        }
        st.push(node);
    }
    public void isCyclic(int n, ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> st=new Stack<>();
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                buildStack(i,adj,vis,st);
            }

        }
        int topo[] = new int[n];
        int ind = 0;
        while(!st.isEmpty()) {
            topo[ind++] = st.pop();
        }
        PrintSolution.print(topo);
    }
    public static void main(String[] args) {
        ArrayList <ArrayList< Integer >> adj = new ArrayList< >();

        // adding new arraylists to 'adj' to add neighbour nodes
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList < > ());
        }


        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(3).add(1);
        adj.get(2).add(3);


        new TopologicalSortUsingDFS().isCyclic(6,adj);
    }
}
