package DP;

//https://takeuforward.org/dynamic-programming/matrix-chain-multiplication-dp-48/
public class MatrixChainMultiplication {


    static int f(int[] arr, int i, int j){

        // base condition
        if(i == j)
            return 0;

        int mini = Integer.MAX_VALUE;

        // partioning loop
        for(int k = i; k<= j-1; k++){

            int ans = f(arr,i,k) + f(arr, k+1,j) + arr[i-1]*arr[k]*arr[j];

            mini = Math.min(mini,ans);

        }

        return mini;
    }


    static int matrixMultiplication(int[] arr, int N){

        int i =1;
        int j = N-1;


        return f(arr,i,j);


    }
}
