package StacknQueue;

//https://takeuforward.org/data-structure/implement-stack-using-array/
public class StackUsingArray {

    private int[] stack;
    private int size;
    private int top;
    public StackUsingArray(int size) {
        this.stack = new int[size] ;

        this.size = size;
        this.top=0;
    }

    public boolean push(int val){
        if(top==size){
            return false;
        }
        stack[top]=val;
        top++;


        return true;
    }
    public int pop(){
        if(top==0){
            return -1;
        }
        int val=stack[top-1];
        stack[top-1]=Integer.MIN_VALUE;
        top--;


        return val;
    }
    public int peek(){
        if(top==0){
            return -1;
        }
        return stack[top-1];
    }
    public int size(){
        return size;
    }
}
