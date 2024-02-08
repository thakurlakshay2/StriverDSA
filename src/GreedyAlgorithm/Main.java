package GreedyAlgorithm;

public class Main {
    public static void main(String[] args) {
        NMeetingsInRoom q1=new NMeetingsInRoom();
        q1.nMeetingsInRoom(new int[]{1,3,0,5,8,5},new int[]{2,4,5,7,9,9});

        MinimumPlatformRequired q2=new MinimumPlatformRequired();
        q2.findMinimumPLatformOptimised(new int[]{900,945,955,1100,1500,1800},new int[]{920,1200,1130,1150,1900,2000} );

        JobSequencingProblem q3=new JobSequencingProblem();
        q3.jobSequencingProblemOptimised(new int[][]{{4,20},{1,10},{2,40},{1,20}});

        FractionalKnapscak  q4=new FractionalKnapscak();
        q4.fractinoalKnapsackOptimal(new int[][]{{100,20},{60,10},{120,30}},50);

        FindMinimumCoins q5=new FindMinimumCoins();
        q5.findMinimumCoinsOptimised(325);

    }
}
