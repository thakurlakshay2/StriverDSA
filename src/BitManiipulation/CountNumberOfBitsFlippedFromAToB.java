package BitManiipulation;

//https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/
public class CountNumberOfBitsFlippedFromAToB {

    public static int minBitFlips(int start, int goal) {
        return bitCount(start^goal);
    }
    public static int bitCount(int num){
        int count=0;
        while(num!=0){
            count+=num&1;
            num>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(minBitFlips(10,7));
    }
}
