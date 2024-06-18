package SlidingWindow;

//https://leetcode.com/problems/count-number-of-nice-subarrays/
public class NumberOfNiceSUbarrays {

    //time : O(n)
    //space : O(n)
    public static void optimal(int[] nums,int k ){
        int [] arr=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]%2;
        }
        System.out.println( Atmost(arr,k)-Atmost(arr,k-1));
    }

    public static int Atmost(int [] arr, int k){
        int i=0;
        int j=0;
        int count=0;
        int sum=0;
        int n=arr.length;
        while(j<n){
            sum+=arr[j];
            while(i<=j && sum>k){
                sum-=arr[i];
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
