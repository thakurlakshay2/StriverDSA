package GreedyAlgorithm;

//https://takeuforward.org/data-structure/find-minimum-number-of-coins/
public class FindMinimumCoins {
    private static final int[] COINS=new int[]{1,2,5,10,20,50,100,500,2000};
    public void findMinimumCoinsOptimised( int amount){
        int n=COINS.length-1;
        while(n>=0){
            if(COINS[n]<=amount){
                int numberOfCoins=amount/COINS[n];
                amount%=COINS[n];
                System.out.println(numberOfCoins +" coins of "+ COINS[n]);
            }
            n--;
        }


    }
}
