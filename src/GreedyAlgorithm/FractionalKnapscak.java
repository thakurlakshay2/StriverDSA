package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapscak {

    private static class Knapsack{
        int values;
        int weight;

        public Knapsack(int values, int weight) {
            this.values = values;
            this.weight = weight;
        }
        public Knapsack(int[] data){
            this.values=data[0];
            this.weight=data[1];
        }
    }
    public void fractinoalKnapsackOptimal(int[][] data,int wantedWeight){
        Knapsack[] j=new Knapsack[data.length];
        for(int i=0;i<data.length;i++){
            j[i]=new Knapsack(data[i]);
        }
        Arrays.sort(j, new Comparator<Knapsack>() {
            @Override
            public int compare(Knapsack o1, Knapsack o2) {
                return o1.values-o2.values;
            }
        });
        int values=0;
        for(Knapsack val:j){
            if(val.weight<=wantedWeight){
                values+= val.values;
                wantedWeight-=val.weight;
            }else {
                values+=val.values*wantedWeight/val.weight;

                break;
            }
        }
        System.out.println(values);
    }
}
