package StacknQueue;

import java.util.Stack;
//https://takeuforward.org/data-structure/implement-queue-using-stack/
public class QueueUsingStack {

    private Stack<Integer> input;
    private Stack<Integer> output;

    public QueueUsingStack() {
        this.input = new Stack<>();
        this.output = new Stack<>();

    }
    public boolean push(int val){
        input.push(val);
        return  true;
    }

    public int peek(){
        if(output.isEmpty()){
            while (!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    public int pop(){
        if(output.isEmpty()){
            while (!input.isEmpty()){
                output.push(input.pop());
            }
        }

        return output.pop();
    }
    public int size(){
        return input.size()+output.pop();
    }

}
