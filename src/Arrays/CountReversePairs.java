package Arrays;

import java.util.Stack;
//dp

public class CountReversePairs {
    public void reversePairCountOptimised(int[] num){
        Stack<Integer> stack=new Stack<>();
        int inverse=0;
        for(int val:num){
            if(stack.isEmpty()){
                stack.push(val);
                continue;
            }
            while(stack.peek()>2*val && !stack.isEmpty()){
                inverse++;
                stack.pop();
            }
            stack.push(val);
        }

        System.out.println(inverse);
    }
}
