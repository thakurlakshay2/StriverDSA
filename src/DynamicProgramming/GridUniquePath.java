package DynamicProgramming;

//https://takeuforward.org/data-structure/grid-unique-paths-dp-on-grids-dp8/
public class GridUniquePath {

    //space optimised dp approach ,we basically need the above row only , no need to take a 2d dp

    //time: O(n*m)
    //space: O(n)

    public  void countWays(int m , int n){
        int prev[]= new int[n];

        for(int i=0;i<m;i++){
            int[] temp=new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    temp[j]=1;
                    continue;
                }
                int up=0;
                int left=0;
                if(i>0)
                    up=prev[j];
                if(j>0)
                    left=temp[j-1];
                temp[j]=up+left;
            }

            prev=temp;
        }
        System.out.println(prev[n-1]);
    }
//https://takeuforward.org/data-structure/grid-unique-paths-2-dp-9/
    //variation for this  , same logic just add conditions for  blocked areas
}
