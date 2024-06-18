package SlidingWindow;

//https://leetcode.com/problems/fruit-into-baskets/description/

public class FruitsInBasket {

    //time O(n)
    //space : O(5)  constant space
    public static void optimalAproach(int[] fruits){
        int max = 0;
        int curMax = 0;
        int prev = -1;
        int prev2 = -1;
        int prevCount = 0;

        for (int fruit: fruits) {
            if (fruit == prev || fruit == prev2) {
                curMax++;
            } else {
                max = Math.max(max, curMax);
                curMax = prevCount + 1;
            }
            if (fruit == prev) {
                prevCount++;
            } else {
                prevCount = 1;
                prev2 = prev;
                prev = fruit;
            }
        }
        System.out.println( Math.max(max, curMax));
    }
    public static void main(String[] args) {
        optimalAproach(new int[]{1,2,3,2,3});
    }
}
