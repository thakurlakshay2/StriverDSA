package BinarySearch;

//https://leetcode.com/problems/koko-eating-bananas/description/
public class KokoEatingBananas {

    public void minEatingSpeed(int[] piles, int H) {
        System.out.println( binarySearch(piles, H));
    }
    public int helper(int[] piles, int k){
        int count = 0;
        for(int i = 0; i < piles.length; i++){
            count += Math.ceil((double)piles[i]/k);
        }
        return count;
    }
    public int binarySearch(int[] piles, int H){
        int low = 1;
        int high = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
            low = Math.min(low,piles[i]);
        }
        int val=H/piles.length;
        high=high/(val<=1?1:val);
        high=Math.max(high,low+1);
        while(low <= high){
            int mid = (high+low)/2;
            int count = helper(piles,mid);
            if(count > H) low = mid+1;
            else{
                ans = Math.min(ans, mid);
                high = mid - 1;
            }
        }
        return ans;
    }
}
