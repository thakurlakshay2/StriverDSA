package BitManiipulation;

import java.util.BitSet;

//https://leetcode.com/problems/count-primes/description/
public class SieveofEratosthenes {
    //Time complexity: O(n)+O(n log log n)+O(n)
    //Space complexity: //O(n)
    public static int optimal(int n){
        BitSet bs = new BitSet(n);
        bs.set(0); bs.set(1);
        int ind = 0, count = 0;
        while(ind < n){
            ind = bs.nextClearBit(ind + 1);
            if(ind >= n)
                return count;
            count++;
            for(int i = 2 * ind; i < n; i += ind)
                bs.set(i);
        }
        return count;
    }
    public static void main(String[] args) {
            System.out.println(optimal(8));
    }
}
