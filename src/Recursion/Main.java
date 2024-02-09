package Recursion;

public class Main {
    public static void main(String[] args) {
        SubSetSums q1=new SubSetSums();
        q1.SubsetSumRecursion(new int[]{5,2,1});
        q1.SubsetSumRecursion(new int[]{1,2,2});

        System.out.println("-----------------");
        CombinationSum q2=new CombinationSum();
        q2.combinatinoSUmOptimised(new int[]{2,3,6,7},7);
        System.out.println("......");
        q2.combinatinoSUmOptimised2(new int[]{10,1,2,7,6,1,5},8);

        System.out.println("-----------------");
        PallindromePartitioning q3=new PallindromePartitioning();
        q3.pallindromePartitionOptimised("aabb");

        FindKthPermutationSequence q4=new FindKthPermutationSequence();
        q4.findPermutation(4,17);
    }
}
