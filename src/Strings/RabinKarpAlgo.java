package Strings;

//String pattern matching algorithm
public class RabinKarpAlgo {
    public final static int d = 256;

    public static void main(String[] args) {
        //RKA

        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";

        // A prime number
        int q = 101;
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;

        for (i = 0; i < M - 1; i++)
            h = (h * d) % q;

        for (i = 0; i < M; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        // Slide the pattern over text one by one
        for (i = 0; i <= N - M; i++) {

            if (p == t) {
                /* Check for characters one by one */
                for (j = 0; j < M; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }

                if (j == M)
                    System.out.println(
                            "Pattern found at index " + i);
            }


            if (i < N - M) {
                t = (d * (t - txt.charAt(i) * h)
                        + txt.charAt(i + M))
                        % q;

                if (t < 0)
                    t = (t + q);
            }
        }
    }
}
