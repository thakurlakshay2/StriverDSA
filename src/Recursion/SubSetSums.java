package Recursion;

import java.util.ArrayList;

//https://takeuforward.org/data-structure/subset-sum-sum-of-all-subsets/
//https://takeuforward.org/data-structure/subset-ii-print-all-the-unique-subsets/
public class SubSetSums {
    public  void SubsetSumRecursion(int[] nums){
        getSubsetSum(nums,0,0);
        System.out.println();
        getAllSubsetSum(nums,0,new ArrayList<>());
    }

    private void getSubsetSum(int[] numbs, int j, int sumTillNow){
        if(j==numbs.length){
            System.out.print(sumTillNow+" , ");
            return;
        }
        //choice 1 not to include the number
            getSubsetSum(numbs,j+1,sumTillNow);
        //choice 2 include the number
        getSubsetSum(numbs,j+1,sumTillNow+numbs[j]);

    }

    private void getAllSubsetSum(int[] numbs, int j, ArrayList<Integer> subsetSum){
        System.out.print("[");
        for(int val:subsetSum){
            System.out.print(val+" ");
        }
        System.out.print("]");
        System.out.println();
       for(int i=j;i<numbs.length;i++){
           if(i!=j && numbs[i]==numbs[i-1]) continue;
           subsetSum.add(numbs[i]);
           getAllSubsetSum(numbs,i+1,subsetSum);

           subsetSum.remove(subsetSum.size()-1);
       }
    }
}
