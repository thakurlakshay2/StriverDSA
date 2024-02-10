package Recursion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SubSetSums q1=new SubSetSums();
        q1.SubsetSumRecursion(new int[]{5,2,1});
        q1.SubsetSumRecursion(new int[]{1,2,2});

        System.out.println("-----------------");
        CombinationSum q2=new CombinationSum();
        q2.combinatinoSUmOptimised(new int[]{2,3,6,7},7);;
        System.out.println("......");
        q2.combinatinoSUmOptimised2(new int[]{10,1,2,7,6,1,5},8);

        System.out.println("-----------------");
        PallindromePartitioning q3=new PallindromePartitioning();
        q3.pallindromePartitionOptimised("aabb");

        FindKthPermutationSequence q4=new FindKthPermutationSequence();
        q4.findPermutation(4,17);

        System.out.println("-----------------");

        PrintAllPermutation q5=new PrintAllPermutation();
        q5.printAllPermuOptimised(new int[]{1,2,3});

        NQueen q6=new NQueen();
        q6.NQueenOptimised(4);

        Sudoku q7=new Sudoku();
        q7.sudoku(new int[][] {{}});                          // Write your own test case and check

        RatInAMaze q8=new RatInAMaze();
        q8.rat(new int[][]{{1, 0, 0, 0},{1, 1, 0, 1},
                                     {1, 1, 0, 0},
                                     {0, 1, 1, 1}} );

        MColoringProblem q9=new MColoringProblem();
        int N = 4, M = 3;
        
         ArrayList<ArrayList< Integer >> G =   new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            G.add(  new ArrayList < > ());
         }
         G.get(0).add(1);
         G.get(1).add(0);
         G.get(1).add(2);
         G.get(2).add(1);
         G.get(2).add(3);
         G.get(3).add(2);
         G.get(3).add(0);
         G.get(0).add(3);
         G.get(0).add(2);
         G.get(2).add(0);
         q9.coloringProblem(G,M);
    }
}