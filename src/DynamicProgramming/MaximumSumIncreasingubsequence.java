package DynamicProgramming;

public class MaximumSumIncreasingubsequence {

    public void msIS(int[] arr){
        int[] msi=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            msi[i]=arr[i];

        }

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    msi[i]=Math.max(msi[i],arr[i]+msi[j]);
                }
            }
        }
        int max=0;
        for(int val:msi){
            max=Math.max(max,val);
        }

        System.out.println(max);
    }
}
