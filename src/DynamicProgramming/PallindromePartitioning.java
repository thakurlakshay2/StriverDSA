package DynamicProgramming;

public class PallindromePartitioning {

    public void ppDP(String str){
        boolean[][] dp=new boolean[str.length()][str.length()];


        for(int gap=0;gap<str.length();gap++){
            for(int i=0, j=gap;j<str.length();j++,i++){
                if(gap==0){
                    dp[i][j]=true;
                }
                else if(gap==1){
                    if(str.charAt(i)==str.charAt(j)){
                        dp[i][j]=true;
                    }
                }
                else{
                    if(str.charAt(i)==str.charAt(j)){
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
            }
        }
        int[] len=new int[str.length()];
        len[0]=0;

        for(int i=1;i<str.length();i++){
            int min=i+1;
            if(dp[0][i]){
                len[i]=0;
                continue;
            }
            for(int j=i;j>=1;j--){
                if(dp[j][i]){
                    min=Math.min(min,(len[j-1]));
                }
            }
            len[i]=min+1;
        }

        // return 0;
        System.out.println( len[str.length()-1]);
    }
}
