package Graph;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/problems/strongly-connected-components-kosarajus-algo/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=strongly-connected-components-kosarajus-algo
public class KosaRajuAlgorithm {
    //Time: O(n * (n + m))
    //Space: O(N)
    boolean dfs(int curr, int des, List<List<Integer>> adj,
                List<Integer> vis) {

        // If curr node is destination return true
        if (curr == des) {
            return true;
        }
        vis.set(curr, 1);
        for (int x : adj.get(curr)) {
            if (vis.get(x) == 0) {
                if (dfs(x, des, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isPath(int src, int des, List<List<Integer>> adj) {
        List<Integer> vis = new ArrayList<>(adj.size() + 1);
        for (int i = 0; i <= adj.size(); i++) {
            vis.add(0);
        }
        return dfs(src, des, adj, vis);
    }

    List<List<Integer>> findSCC(int n, List<List<Integer>> a) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> is_scc = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            is_scc.add(0);
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (List<Integer> edge : a) {
            adj.get(edge.get(0)).add(edge.get(1));
        }

        for (int i = 1; i <= n; i++) {

            if (is_scc.get(i) == 0) {

                List<Integer> scc = new ArrayList<>();
                scc.add(i);

                for (int j = i + 1; j <= n; j++) {

                    if (is_scc.get(j) == 0 && isPath(i, j, adj)
                            && isPath(j, i, adj)) {
                        is_scc.set(j, 1);
                        scc.add(j);
                    }
                }

                ans.add(scc);
            }
        }
        return ans;
    }



    public static void main(String[] args) {

        KosaRajuAlgorithm obj = new KosaRajuAlgorithm();
        int V = 5;
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(List.of(1, 3)));
        edges.add(new ArrayList<>(List.of(1, 4)));
        edges.add(new ArrayList<>(List.of(2, 1)));
        edges.add(new ArrayList<>(List.of(3, 2)));
        edges.add(new ArrayList<>(List.of(4, 5)));
        List<List<Integer>> ans = obj.findSCC(V, edges);
        for (List<Integer> x : ans) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
