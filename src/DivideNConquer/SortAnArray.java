package DivideNConquer;

public class SortAnArray {
    static void merge(int[] nums, int l, int r, int m) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++)
            a[i] = nums[l + i];
        for (int i = 0; i < n2; i++)
            b[i] = nums[m + 1 + i];

        int idx = l;
        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                nums[idx] = a[i];
                i++;
                idx++;
            } else {
                nums[idx] = b[j];
                j++;
                idx++;
            }
        }

        while (i < n1) {
            nums[idx] = a[i];
            idx++;
            i++;
        }
        while (j < n2) {
            nums[idx] = b[j];
            idx++;
            j++;
        }
    }

    static void mergeSort(int[] nums, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(nums, l, m);
            mergeSort(nums, m + 1, r);
            merge(nums, l, r, m);
        }
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    public static void main(String[] args) {
        SortAnArray o=new SortAnArray();
        o.sortArray(new int[]{5,1,1,2,0,0});
    }
}
