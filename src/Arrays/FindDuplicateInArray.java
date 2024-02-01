package Arrays;

import java.util.Arrays;

//https://takeuforward.org/data-structure/find-the-duplicate-in-an-array-of-n1-integers/
public class FindDuplicateInArray {
    public void findDuplicateApproach1(int[] num){
        Arrays.sort(num);

        for(int i=0;i<num.length-1;i++){
            if(num[i]== num[i+1]){
                System.out.println(num[i]);
                return;
            }
        }
        System.out.print("No duplicates");
    }

    //JUmp to index
    public void findDuplicateApproachOptimised(int[] num){

        int startIndex=num[0];
        num[0]*=-1;

        while(num[startIndex]>0){
            if(num[startIndex]<0){

                break;
            }
            int prevIndex=startIndex;
            startIndex=num[startIndex];
            num[prevIndex]*=-1;

        }

        System.out.println(num[startIndex]);
    }
}
