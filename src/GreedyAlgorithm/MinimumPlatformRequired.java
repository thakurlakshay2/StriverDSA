package GreedyAlgorithm;

import java.util.Arrays;

//https://takeuforward.org/data-structure/minimum-number-of-platforms-required-for-a-railway/
public class MinimumPlatformRequired {
    //1st case basic on 2 technique  , check every train for every other train i= 0 ->n-1 then j= i->n-1
    public void findMinimumPLatformOptimised(int[] arrival,int[] departure){
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i=1;
        int j=0;
        int platform=1;
        int max=0;
        while(i<arrival.length && j<departure.length){
            if(arrival[i]<=departure[j]){
                platform++;
                i++;
            }
            else if(arrival[i]>departure[j]){
                platform--;
                j++;
            }
            max=Math.max(platform,max);
        }

        System.out.println(max);

    }
}
