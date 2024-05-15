package SlidingWindow;


//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/submissions/
public class MaximumPointsYouCanObtainFromCards {

    public static int maxScore(int[] cardPoints, int k) {
        int max = 0, sum = 0;
        for(int i = 0; i<k;i++) sum += cardPoints[i];

        max=sum;
        for(int i=1;i<=k;i++){
            sum=sum+ cardPoints[cardPoints.length -i] - cardPoints[k -i];
            max=Math.max(max,sum);
        }

        return max;
    }
    public static   void main(String[] args) {
        maxScore(new int[]{1,2,3,4,5,6,1},3);
    }
}
