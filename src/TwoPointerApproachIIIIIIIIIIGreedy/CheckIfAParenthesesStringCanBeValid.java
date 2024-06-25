package TwoPointerApproachIIIIIIIIIIGreedy;

import java.util.Stack;

//https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/description/
public class CheckIfAParenthesesStringCanBeValid {

    //time: 2*O(n);
    //soace: 2*O(n);
    //similar idea to ValidParenthesisString question ,
    // just convert any modifiable bracket to *.
    //
    public boolean canBeValid(String s, String locked)
    {
        Stack<Integer> open=new Stack<>();
        Stack<Integer> free=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(locked.charAt(i)=='0')
                free.push(i);

            else if(s.charAt(i)=='(')
                open.push(i);

            else if(s.charAt(i)==')' && !open.isEmpty())
                open.pop();

            else if(s.charAt(i)==')' && !free.isEmpty())
                free.pop();

            else
            {
                System.out.println(i);
                return false;
            }

        }

        while(!open.isEmpty() && !free.isEmpty())
        {
            if(open.peek()>free.peek())
                return false;

            open.pop();
            free.pop();
        }

        if(!open.isEmpty())
            return false;

        if(free.size()%2!=0)
            return false;

        return true;
    }
    public static void main(String[] args) {
        new CheckIfAParenthesesStringCanBeValid().canBeValid("))()))","010100");
    }
}
