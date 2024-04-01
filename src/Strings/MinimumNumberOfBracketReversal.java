package Strings;

import java.util.Stack;

// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
public class MinimumNumberOfBracketReversal {
   private static boolean isValid(char c1,char c2){
    switch (c2) {
        case '[':
            return c1==']';
            
        case '{':
        return c1=='}';

        case '(':
        return c1==')';

    
        default:
        return false;

    }
   }
    public static void minBracket(String str){
    Stack<Character> st=new Stack<>();
    int  c=0;
    for(char ch:str.toCharArray()){
        if(ch=='(' || ch=='[' || ch=='{'){
            st.push(ch);
        }else if(ch=='}' || ch==')' || ch==']'){
            char popped=st.pop();

            if(isValid(popped,ch)){
                c++;
            }
        }
    }
    System.out.println(c);
   }
    public static void main(String[] args) {
            minBracket("(([[[[[[]]]]))");
    }
}
