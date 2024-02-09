package Recursion;

import java.util.ArrayList;

public class FindKthPermutationSequence {
    public void findPermutation(int n, int k){
        ArrayList<Integer> index=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++){
            fact*=i;
            index.add(i);
        }
        index.add(n);
        k--;
        String ans="";
        while(true){
            ans+= index.get(k/fact);

            index.remove(k/fact);
            if(index.isEmpty()){
                break;
            }
            k=k%fact;
            fact=fact/index.size();
        }

        System.out.print(ans);
    }
}
