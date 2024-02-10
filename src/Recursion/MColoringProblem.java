package Recursion;
//https://takeuforward.org/data-structure/m-coloring-problem/
import java.util.ArrayList;

public class MColoringProblem {

    public void coloringProblem(ArrayList<ArrayList<Integer>> graph,int k) {
        boolean ans=dfs(graph,k,new int[graph.size()], 0);
        if(ans){
            System.out.print("1");
        }else{
            System.out.print("0");

        }
    }
    private boolean dfs(ArrayList<ArrayList<Integer>> graph , int k,int[] color,int node){
        if(node== graph.size()) {

            return true;
        }

        for(int i=1;i<=k;i++){
            if(valid(graph,i,node,color)){
                color[node]=1;
                if(dfs(graph,k,color,node+1)) return true;
                color[node]=0;
            }
        }
        return false;
    }
    private boolean valid(ArrayList<ArrayList<Integer>> graph , int k,int node,int[] color){
        if(color[node]!=0){
            return false;
        }
        ArrayList<Integer>  friends=graph.get(node);

        for(Integer va:friends){
            if(color[va]==k){
                return false;
            }
        }

        return true;

    }
}
