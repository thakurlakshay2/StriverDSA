package Arrays;
//https://takeuforward.org/data-structure/search-in-a-sorted-2d-matrix/
public class SearchIn2DMatrix {

    public void SearchIn2dMatrixBrute(int[][] nums,int search){
        for(int[] num:nums){
            for(int val:num){
                if(search==val){
                    System.out.println("Found");
                    return;
                }

            }
        }

        System.out.println("Not found");
    }

    public void SearchIn2dMatrixOptimised(int[][] nums,int search){
        int n=nums.length*nums[0].length;
        int i=0;
        int j=n;
        while(i<j){
            int mid=(i+j)/2;
            int row=mid/nums.length;
            int col=mid%(nums[0].length);
            int val=nums[row][col];
            if(val==search){
                System.out.println("Found");
                return;
            }else if(val<search){
                i=mid;
            }else{
                j=mid;
            }
        }


        System.out.println("Not found");
    }
}
