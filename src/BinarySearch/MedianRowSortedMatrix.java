package BinarySearch;

import java.util.Arrays;

//https://takeuforward.org/data-structure/median-of-row-wise-sorted-matrix/
public class MedianRowSortedMatrix {
    public void medianRowSorted(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        binarySearch(matrix,n,m);
    }


    //Brute force approach
    //time : O(row*col*log(row*col))  for sorting array
    //space : O(row * col);
    private void findMediam(int[][] matrix, int row,int col){
        int[] median=new int[row*col];
        int idx=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                median[idx]=matrix[i][j];
                idx++;
            }
        }
        Arrays.sort(median);
        System.out.println( median[(row*col)/2]);
    }


    //optimised approach
    // time : O(log(1000)*row*log(col))
    //space : O(1)    // for low and hi.
    //here 1000 is the maximum limit of the number that might be available at any cell in the array..
    // check question and update this accordingly .
    private void binarySearch(int[][] matrix,int n,int m){
        int low=1;
        int hi=1000000;
        while (low<=hi){
            int mid=(low+hi)>>1;  // this is basically low + hi /2;
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
            int md = (l + h) >> 1;  // (l+h)/2
            if (row[md] <= mid) {
                l = md + 1;
            } else {
                h = md - 1;
            }
        }
        return l;
    }

}
