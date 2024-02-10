package Recursion;
//https://takeuforward.org/data-structure/print-all-permutations-of-a-string-array/
public class PrintAllPermutation {

    //TIME o N!*N space o N
    public void printAllPermuOptimised(int[] nums){
            recursion(0,nums);
    }
    private void recursion(int j,int[] nums){
        if(j==nums.length){
            System.out.print("[");
            for(int val:nums){
                System.out.print(val+" ");
            }

            System.out.print("]");
            System.out.println();
            return ;
        }
        for(int i=j;i<nums.length;i++){
            swap(j,i,nums);
            recursion(j+1,nums);
            swap(j,i,nums);
        }
    }
    private void swap(int i,int j,int[] arr){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
