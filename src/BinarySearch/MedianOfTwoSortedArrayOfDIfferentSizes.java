package BinarySearch;

//https://takeuforward.org/data-structure/median-of-two-sorted-arrays-of-different-sizes/
public class MedianOfTwoSortedArrayOfDIfferentSizes {

    public void findMedian(int[] arr,int[] nums){
        medianBrute(arr,nums);
        medianOptimised(arr,nums);
    }

    //Brute force
    //time - O(n+m)
    //Space - O(n+m);
    public void medianBrute(int[] arr,int[] num){
        int[] mix=new int[arr.length+num.length];
        int i=0,j=0;
        int k=0;
        while (k<mix.length){
            if(i==arr.length && j==num.length){
                break;
            }else if(i== arr.length){
                mix[k]=num[j];
                j++;
            }else if(j==num.length){
                mix[k]=arr[i];
                i++;
            }

            if(arr[i]<num[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=num[j];
                j++;
            }

            k++;
        }

        System.out.println(mix[mix.length/2]);
    }


    //Optimised
    // time : O(log(min(arr,num)))
    // space : O(1)
    public double medianOptimised(int[] a,int[] b){
        int n1 = a.length, n2 = b.length;
        if (n1 > n2) return medianOptimised(b, a);

        int n = n1 + n2; //total length
        int left = (n1 + n2 + 1) / 2; //length of left half

        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) / 2;   //mid1 size of array a taken
            int mid2 = left - mid1;   //leftHalf - mid1 size of array b taken

            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }
}
