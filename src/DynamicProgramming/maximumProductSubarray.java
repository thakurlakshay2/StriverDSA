package DynamicProgramming;

//https://takeuforward.org/data-structure/maximum-product-subarray-in-an-array/
public class maximumProductSubarray {

    public void mps(int[] arr){
        int prod1 = arr[0],prod2 = arr[0],result = arr[0];

        for(int i=1;i<arr.length;i++) {
            int temp = Math.max(arr[i],Math.max(prod1*arr[i],prod2*arr[i]));
            prod2 = Math.min(arr[i],Math.min(prod1*arr[i],prod2*arr[i]));
            prod1 = temp;

            result = Math.max(result,prod1);
        }
        System.out.println(result);
    }

}
