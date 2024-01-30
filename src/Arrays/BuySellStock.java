package Arrays;

public class BuySellStock {
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
    public void BuySellStockQ1(int[] nums){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int stockPrice:nums){
                if(stockPrice<minPrice){
                    minPrice=stockPrice;
                }else if(stockPrice-minPrice>maxProfit){
                    maxProfit=stockPrice-minPrice;
                }
        }
        System.out.println(maxProfit);
    }

    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
    public void BuySellStockQ2(int[] nums){
        if(nums.length<=1){
            System.out.println(0);
            return;
        }
        int maxProfit=0;
        for(int i=1;i<nums.length;i++){
           maxProfit+=Math.max(0,nums[i]-nums[i-1]);
        }
        System.out.println(maxProfit);
    }

//    https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/description/
    public void BuySellStockQ3(int[] nums){
        //2 stock at same time
        int buy1=Integer.MIN_VALUE;
        int buy2=Integer.MIN_VALUE;
        int sell1=0;
        int sell2=0;

        if(nums.length<=1){
            System.out.println(0);
            return;
        }

        for(int i=0;i<nums.length;i++){
            sell2=Math.max(sell2,buy2+nums[i]);
            buy2=Math.max(buy2,sell1-nums[i]);
            sell1=Math.max(sell1,buy1+nums[i]);
            buy1=Math.max(buy1,- nums[i]);

        }
        System.out.println(sell2);
    }

//    https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/

    public void BuySellStockQ4(int[] nums,int K){
        int[][] dp=new int[K+1][nums.length];

        for(int k=1;k<=K;k++){
            int profitIfBoughtBefore=-nums[0];
            for(int i=1;i<nums.length;i++){
                dp[k][i]=Math.max(dp[k][i-1],nums[i]+profitIfBoughtBefore);//sell
                profitIfBoughtBefore=Math.max(profitIfBoughtBefore,dp[k-1][i]-nums[i]); //buy

            }
        }

        System.out.println(dp[K][nums.length-1]);
    }

    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/
    public void BuySellStockQ5(int[] nums){
        if(nums.length==0){
            System.out.println(0);
            return;
        }
        int profitAtSell=0;
        int profitAtBuy=Integer.MIN_VALUE;
        int profitAtSellOld=0;

        for(int val:nums){
            int  temp=profitAtSell;

            profitAtSell=Math.max(profitAtSell,profitAtBuy+val);
            profitAtBuy=Math.max(profitAtBuy,profitAtSellOld-val);
            profitAtSellOld=temp;
        }
        System.out.println(profitAtSell);
    }
}
