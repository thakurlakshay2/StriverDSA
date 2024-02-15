package StacknQueue;

import java.util.LinkedList;
import java.util.Queue;

//https://takeuforward.org/data-structure/implement-stack-using-single-queue/
public class StackUsingQueue {
    private Queue<Integer> stack;
    private int size;
    private int currSize;
    public StackUsingQueue(int size) {
        this.stack = new LinkedList<Integer>();

        this.size = size;
        this.currSize=0;
    }

    public boolean push(int val){
        if(currSize==size){
            return false;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<size;i++){
            q.add(stack.poll());
        }
        stack.add(val);
        for(int i=0;i<currSize;i++){
            stack.add(q.poll());
        }
        currSize++;
        return true;
    }
    public int pop(){
        if(currSize==0){
            return -1;
        }
        int val=stack.peek();
        stack.poll();


        currSize--;
        return val;
    }
    public int peek(){
        if(currSize==0){
            return -1;
        }
        return stack.peek();
    }
    public int size(){
        return size;
    }
}
