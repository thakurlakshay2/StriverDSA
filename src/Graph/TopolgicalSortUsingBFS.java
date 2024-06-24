package Graph;

import Arrays.PrintSolution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//https://www.geeksforgeeks.org/problems/topological-sort/1
public class TopolgicalSortUsingBFS {

    //using queue
    //space O(N)+O(N)
    //time: O(N+E)
    public void isCyclic(int n,ArrayList<ArrayList<Integer>> adj){
        int[] indegree=new int[n];
        int[] topo = new int[n];

        for(int i=0;i<n;i++){
            for(int pointed:adj.get(i)){
                indegree[pointed]++;
            }
        }

        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                que.add(i);
            }
        }
        int idx=0;
        int count=0;
        while(!que.isEmpty()){
            int node=que.poll();
            topo[idx++]=node;
            count++;
            for(int pointed:adj.get(node)){
                indegree[pointed]--;
                if(indegree[pointed]==0){
                    que.add(pointed);
                }
            }


        }


        PrintSolution.print(topo);
    if(count==n) {System.out.println(false);
    return ;}
    System.out.println(true);

    }

    public static void main(String[] args) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList< >();

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


        new TopolgicalSortUsingBFS().isCyclic(6,adj);
    }
}
