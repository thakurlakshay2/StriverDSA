package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NextPermutation q1=new NextPermutation();
        int[] arr1={1,2,3,4,5,6,5,4,3,2,1};
         q1.nextPermutationSolve(arr1);
        PrintSolution.print(arr1);

        SetMatrixZeroes q2=new SetMatrixZeroes();
        int[][] arr2={{1,1,1},{1,0,1},{1,1,0}};
        q2.setZeroesOptimised(arr2);
        PrintSolution.print(arr2);

        PascalTriangle q3=new PascalTriangle(8);

        System.out.println(q3.getNRdata(3,2));
        System.out.println(q3.pascalTriangleOptimised(3,2));

        MaximumSubarray q4=new MaximumSubarray();
        System.out.println(q4.maxSubarrayOptimised(new int[]{-2,1,-3,4,-1,2,1,-5,4})); //

        SortColors q5=new SortColors();
        q5.SortColorBrute(new int[]{2,0,2,1,1,0});
        q5.SortColorOptimised(new int[]{2,0,2,1,1,0});

        BuySellStock q6=new BuySellStock();
        int[] arr6=new int[]{7,1,5,3,6,4};
        q6.BuySellStockQ1(arr6);
        q6.BuySellStockQ2(arr6);
        q6.BuySellStockQ3(new int[]{3,3,5,0,0,3,1,4});
        q6.BuySellStockQ4(new int[]{3,3,5,0,0,3,1,4},3);
        q6.BuySellStockQ5(new int[]{3,3,5,0,0,3,1,4});

        RotateImage q7=new RotateImage();
        q7.rotateImageOptimised(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

        mergeOverlapIntervals q8=new mergeOverlapIntervals();
        q8.mergeOverlapIntervalsCodeOptimised(new int[][]{{1,3},{2,6},{8,10},{15,18},{12,19}});

    }
}
