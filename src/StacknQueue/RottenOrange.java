package StacknQueue;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange {
    public  void getTime(int[][] arr){
        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==2){
                    queue.add(new int[]{i,j});
                }
            }
        }

        int time=0;
        while (!queue.isEmpty()){
            int length=queue.size();

            for(int k=0;k<length;k++){
                int[] idx=queue.poll();
                int i=idx[0];
                int j=idx[1];
                //rotten all 4 directions
                if(i>0 &&  arr[i-1][j]==1) arr[i-1][j]=2;
                if(j>0 &&  arr[i][j-1]==1) arr[i-1][j]=2;
                if(i< arr.length &&  arr[i+1][j]==1) arr[i-1][j]=2;
                if(j<arr[0].length &&  arr[i][j+1]==1) arr[i-1][j]=2;

                time++;

            }
        }

    }
}
