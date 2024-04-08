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

        KokoEatingBananas q7=new KokoEatingBananas();
        q7.minEatingSpeed(new int[]{30,11,23,4,20},6);

        MinimizeMaxGasStation q8=new MinimizeMaxGasStation();
        q8.minmaxGasDist(new int[]{23,24,36,39,46,56,57,65,84,98},1);

        FindPeakElement q9=new FindPeakElement();
        q9.fpe(new int[]{1,2,1,3,5,6,4});
    }
}
