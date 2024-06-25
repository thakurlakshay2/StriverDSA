package TwoPointerApproachIIIIIIIIIIGreedy;
//https://leetcode.com/problems/valid-parenthesis-string/description/
public class ValidParenthesisString {

    //Using two pointers,
    // time: O(n)
    // space: O(1);
    //logic is to have two counts, one considering * as ( and another as ).
    //then if at any point any one of them is negative, showing unbalance , we return false.
    public boolean checkValidString(String s) {
        int start=0;  int end=s.length()-1;
        int openCount=0;
        int closeCount=0;
        while(start<=end){
            char ch=s.charAt(start);
            if(ch=='*'|| ch =='('){
                openCount++;
            }else{
                openCount--;
            }



            char endChar=s.charAt(end-start);
            if(endChar==')' || endChar=='*'){
                closeCount++;
            }else{
                closeCount--;
            }
            if(openCount<0 || closeCount<0){
                return false;
            }


            start++;
        }
        return true;
    }
    public static void main(String[] args) {

        new ValidParenthesisString().checkValidString("((*))(*))**");
    }
}
