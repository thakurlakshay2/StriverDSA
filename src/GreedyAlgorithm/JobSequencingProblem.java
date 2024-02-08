package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

//https://takeuforward.org/data-structure/job-sequencing-problem/
public class JobSequencingProblem {
    private static class Jobs{
        int deadline;
        int profit;

        public Jobs(int deadline, int profit) {
            this.deadline = deadline;
            this.profit = profit;
        }
        public Jobs(int[] a){
            this.deadline=a[0];
            this.profit=a[1];
        }
    }
    public void jobSequencingProblemOptimised(int[][] data ){
        Jobs[] j=new Jobs[data.length];
        for(int i=0;i<data.length;i++){
            j[i]=new Jobs(data[i]);
        }

        Arrays.sort(j, new Comparator<Jobs>() {
            @Override
            public int compare(Jobs o1, Jobs o2) {
                if(o1.deadline<o2.deadline){
                    return 1;
                }else if(o1.deadline>o2.deadline){
                    return -1;
                }else if(o1.profit>o2.profit){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        int joptime=0;
        int totalProfit=0;
        for(Jobs a:j){
            if(a.deadline==joptime){
                continue;
            }
            else{
                totalProfit+=a.profit;
                joptime++;
            }
        }
        System.out.println(totalProfit);
    }
}
