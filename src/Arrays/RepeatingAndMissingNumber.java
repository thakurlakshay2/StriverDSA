package Arrays;

import java.util.Arrays;

public class RepeatingAndMissingNumber {


    //n sq. time  1 space
    public void repeatingAndMissingNumberBrute(int[] nums){
        Arrays.sort(nums);
        int repeated=0;
        int missing=0;
        //we can do binary search
        for(int i=1;i<=nums.length;i++){
            boolean found=false;
           for(int val:nums){
               if(val==i){
                   if(found){
                       repeated=i;
                       break;
                   }
                   found=true;

               }
           }
           if(!found){
               missing=i;
           }
        }

        System.out.println(repeated+" "+ missing);

    }

    //USING HASH ARRRAY (n time , n space)
    public void repeatingAndMissingNumberBetter(int[] nums){
        int[] hashTable=new int[nums.length+1];


        int repeated=0;
        int missing=0;
        //we can do binary search
        for(int i=0;i<nums.length;i++){
            hashTable[nums[i]]++;
        }
        for(int i=1;i<nums.length+1;i++){
            if(hashTable[i]>1){
                repeated=i;
            }else if(hashTable[i]==0){
                missing=i;
            }
        }

        System.out.println(repeated+" "+missing);

    }

    public void repeatingAndMissingNumberMathSolution(int[] nums){
        int[] hashTable=new int[nums.length+1];
        int n=nums.length;
        int supposedSum=n*(n+1)/2;
        int actualSum=0;
        int actualSumOfSquares=0;
        int supposedSumOfSqNSum=n*(n+1)*(2*n+1)/6;
        for(int val:nums){
            actualSum+=val;
            actualSumOfSquares+= val*val;
        }
        int deltaSq= supposedSumOfSqNSum-actualSumOfSquares; //x^2 - y^2
        int delta=supposedSum-actualSum; //x-y
        int sumOfMissingAndRepeating=deltaSq/delta;  //x+y
        int x=(sumOfMissingAndRepeating+delta)/2;
        int y=x- delta;

    System.out.println(x +" "+ y);
    }
//    public void repeatingAndMissingNumberBetter(int[] nums){
//        int[] hashTable=new int[nums.length+1];
//
//
//        int repeated=0;
//        int missing=0;
//        //we can do binary search
//        for(int i=0;i<nums.length;i++){
//            hashTable[nums[i]]++;
//        }
//        for(int i=1;i<nums.length+1;i++){
//            if(hashTable[i]>1){
//                repeated=i;
//            }else if(hashTable[i]==0){
//                missing=i;
//            }
//        }
//
//        System.out.println(repeated);
//        System.out.println(missing);
//
//    }
}
