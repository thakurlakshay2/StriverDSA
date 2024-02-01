package Arrays;

import java.util.Arrays;

//https://takeuforward.org/data-structure/merge-two-sorted-arrays-without-extra-space/
public class MergeTwoSortedArrays extends PrintSolution{

    //NO USING OF EXTRA SPACE

    //O(m+n) + o(n lon n ) + o(m log m)
    public void mergeTwoSortedArrayApprocah1(int[] n, int[] m){
        int p1=0;
        int p2=0;

        int nLength=n.length;

        while(p1+p2 < nLength-2){
            if(n[p1]<=m[p2]){
                p1++;
            }else {
                p2++;
            }
        }

        p1++;
        while(p1<nLength){
            int temp=n[p1];
            n[p1]=m[nLength-p1-1];
            m[nLength-p1-1]=temp;
            p1++;
        }

        Arrays.sort(n);
        Arrays.sort(m);

        print(n);
        print(m);
    }
}
