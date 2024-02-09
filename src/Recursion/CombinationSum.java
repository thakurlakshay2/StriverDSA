package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

//https://takeuforward.org/data-structure/combination-sum-1/
//https://takeuforward.org/data-structure/combination-sum-ii-find-all-unique-combinations/
public class CombinationSum {

    public void combinatinoSUmOptimised(int[] numbs,int sum){
            recursion(numbs,0,sum,new ArrayList<>());
    }
    private void recursion(int[] numbs ,int j, int val, ArrayList<Integer> ans){
        if(val==0){
            System.out.print("[");
            for(int a:ans){
                System.out.print(a+" ");
            }
            System.out.print("]");
            System.out.println();
        }else if( val<0){
            return ;
        }

        for(int i=j;i<numbs.length;i++){
            ans.add(numbs[i]);
            recursion(numbs,i,val-numbs[i],ans);
            ans.remove(ans.size()-1);
        }
    }

    public void combinatinoSUmOptimised2(int[] numbs,int sum){
        Arrays.sort(numbs);
        recursion2(numbs,0,sum,new ArrayList<>());
    }
    private void recursion2(int[] numbs ,int j, int val, ArrayList<Integer> ans){
        if(val==0){
            System.out.print("[");
            for(int a:ans){
                System.out.print(a+" ");
            }
            System.out.print("]");
            System.out.println();
        }else if( val<0){
            return ;
        }

        for(int i=j;i<numbs.length;i++){
            if(i!=j && numbs[i]==numbs[i-1]) continue;

            ans.add(numbs[i]);
            recursion2(numbs,i+1,val-numbs[i],ans);
            ans.remove(ans.size()-1);
        }
    }
}
