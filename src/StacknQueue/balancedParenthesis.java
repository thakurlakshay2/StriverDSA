package StacknQueue;

import java.util.Stack;

//https://takeuforward.org/data-structure/check-for-balanced-parentheses/
public class balancedParenthesis {

    public boolean balanceCheck(String str){
        Stack<Character> stack=new Stack<>();
        char[] ch=str.toCharArray();
        for(char c:ch){
            if(c=='{' || c=='[' || c=='('){
                stack.push(c);
            }else if(c=='}' || c==']' || c==')'){
                switch (c){
                    case ')':
                        if(stack.peek()=='(') stack.pop();
                        else return false;
                        break;
                    case ']':
                        if(stack.peek()=='[') stack.pop();
                        else return false;
                        break;
                    case '}':
                        if(stack.peek()=='{') stack.pop();
                        else return false;
                        break;
                }
            }


        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
