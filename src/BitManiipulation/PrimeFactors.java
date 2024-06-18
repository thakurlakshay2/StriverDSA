package BitManiipulation;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/prime-factors5052/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=Prime-Factors
public class PrimeFactors {

    public static  void bit(int n){
        boolean[] prime=new boolean[n / 2];
        Arrays.fill(prime, false);


        for (int i = 3 ; i * i < n; i += 2)
        {

            if (!prime[i / 2])
                for (int j = i * i; j < n; j += i * 2)
                    prime[j / 2] = true;
        }

        // writing 2 separately
        System.out.print("2 ");

        // Printing other primes
        for (int i = 3; i < n ; i += 2)
            if (!prime[i / 2])
                System.out.print(i + " ");
    }
    public static void main(String[] args) {

    }
}
