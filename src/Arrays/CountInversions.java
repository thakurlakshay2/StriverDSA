package Arrays;

import java.util.Stack;

public class CountInversions {
    public void CountInversions(int[] num){
        Stack<Integer> stack=new Stack<Integer>();

        int inversion=0;
        stack.push(num[0]);
        for(int i=1;i<num.length;i++){

                while(!stack.isEmpty() && stack.peek()<=num[i]){
                    stack.pop();
                }


            inversion+=stack.size();
            stack.push(num[i]);
        }

        System.out.println(inversion);
    }
}
