package BinarySearch;

public class Main {
    public static void main(String[] args) {
        NthRootOfNumbers q1=new NthRootOfNumbers();
        q1.nthRoot(3,27);

        MedianRowSortedMatrix q2=new MedianRowSortedMatrix();
        q2.medianRowSorted(new int[][] {{1,3,8},{2,3,4},{1,2,5}});

        SearchASingleElementInRepeatedArray q3=new SearchASingleElementInRepeatedArray();
        q3.searchBrute(new int[]{1,1,2,2,3,3,4,5,5,6,6,7,7});
        q3.binarySearch(new int[]{1,1,2,2,3,3,4,5,5,6,6,7,7});

        System.out.println();
        SearchPivotInSortedArray q4=new SearchPivotInSortedArray();
        q4.pivotSortedSearch(new int[]{7,8,9,1,2,3,4,5,6},4);

        AllocateMinimumPages q5=new AllocateMinimumPages();
        q5.allocatePages(new int[]{25,46,28,49,24},4);

        AgressiveCows q6=new AgressiveCows();
        q6.cows(new int[]{0,3,4,7,10,9},4);
    }
}
