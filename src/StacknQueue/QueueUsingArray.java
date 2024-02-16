package StacknQueue;

//https://takeuforward.org/data-structure/implement-queue-using-array/
public class QueueUsingArray {
    private int[] queue;
    private int size,start,end,currSize;

    public QueueUsingArray( int size) {
        this.queue = new int[ size];
        this.size = size;
        this.start = 0;
        this.end = 0;
        this.currSize = 0;
    }

    public boolean push(int val){
       if(currSize==size){
           return false;
       }
       if(end==size){
           queue[end%size]=val;
           if(end%size==start) start++;

           return true;
       }


        queue[end]=val;
        end++;
        currSize++;
        return true;
    }
    public int pop(){
        if(currSize==0){
            return -1;
        }

        int val=queue[start];
        queue[start]=Integer.MIN_VALUE;
        start++;
        currSize--;
        return val;
    }
    public int top(){
        if(start==0){
            return -1;
        }
        return queue[start];
    }
    public int size(){
        return currSize;
    }
}
