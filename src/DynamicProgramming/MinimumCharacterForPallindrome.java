package DynamicProgramming;

//https://www.geeksforgeeks.org/minimum-characters-added-front-make-string-palindrome/
//lpa
public class MinimumCharacterForPallindrome {

    public void makePallindrome(String str){
        StringBuilder s=new StringBuilder();
        s.append(str);

        String rev=s.reverse().toString();
        s.reverse().append("$").append(rev);
        int[] lps=lps(s.toString());
        System.out.println( str.length()-lps[s.length()-1]);

    }
    private int[] lps(String str){
        int n=str.length();
        int lps[]= new int[n];
        int i=1, len=0;
        lps[0]=0;
        while(i<n){
            if(str.charAt(i)==str.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }



}
