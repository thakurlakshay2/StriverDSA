package Arrays;

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
    }
}
