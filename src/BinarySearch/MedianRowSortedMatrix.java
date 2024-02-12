package BinarySearch;

//https://takeuforward.org/data-structure/median-of-row-wise-sorted-matrix/
public class MedianRowSortedMatrix {
    public void medianRowSorted(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        binarySearch(matrix,n,m);
    }
    private void binarySearch(int[][] matrix,int n,int m){
        int low=1;
        int hi=1000000;
        while (low<=hi){
            int mid=(low+hi)>>1;
            int cnt=0;
            for(int i=0;i<n;i++){
                cnt+=count(matrix[i],mid);
            }
            if(cnt<=(n*m)/2){
                low=mid+1;
            }else{
                hi=mid-1;
            }
        }

        System.out.println(low);

    }
    private int count(int[] row,int mid){
        int l = 0, h = row.length - 1;
        while (l <= h) {
            int md = (l + h) >> 1;
            if (row[md] <= mid) {
                l = md + 1;
            } else {
                h = md - 1;
            }
        }
        return l;
    }

}
