package Arrays;

public class PrintSolution {
    public static void print(int[] nums){
        for(int a:nums){
            System.out.print(a+" ");
        }
         System.out.println();
    }
    public static void print(int[][] nums){
        for(int[]  a:nums){
            for(int b: a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
