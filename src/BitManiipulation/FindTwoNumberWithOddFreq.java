package BitManiipulation;

//https://www.geeksforgeeks.org/problems/two-numbers-with-odd-occurrences5846/1
public class FindTwoNumberWithOddFreq {
    public static void optimised(int[] arr , int size){
        int xor2 = arr[0];

        /* Will have only single set bit of xor2 */
        int set_bit_no;
        int i;
        int n = size - 2;
        int x = 0, y = 0;

      /* Get the xor of all elements in arr[].
         The xor will basically be xor of two
         odd occurring elements */
        for(i = 1; i < size; i++)
            xor2 = xor2 ^ arr[i];
        set_bit_no = xor2 & ~(xor2-1);


        for(i = 0; i < size; i++)
        {

            if((arr[i] & set_bit_no)>0)
                x = x ^ arr[i];

            else
                y = y ^ arr[i];
        }

        System.out.println("The two ODD elements are "+
                x + " & " + y);


    }
    public static void main(String[] args) {
        optimised(new int[]{1,2,3,3,1,4,4,5,6,5},10);
    }
}
