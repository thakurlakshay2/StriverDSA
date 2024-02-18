package StacknQueue;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> st;
    private int min;
    public MinStack() {
        this.st = new Stack<>();
        this.min=Integer.MAX_VALUE;
    }

    public void push(int x){

        if(x<min){
            st.push(min);
            min=x;
        }
        st.push(x);

    }
    public int  pop(){

        int val=st.pop();
        if(val==min){
             min=st.pop();
        }
        return val;
    }
    public int peek(){
        return st.peek();
    }
    public int min(){
        return min;
    }
}
