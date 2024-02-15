package StacknQueue;

public class Main {
    public static void main(String[] args) {
        StackUsingArray stack=new StackUsingArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(8);
        System.out.println(stack.peek());

        System.out.println("--------");
        QueueUsingArray queue=new QueueUsingArray(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.top());
        System.out.println(queue.size()+" size");
        queue.push(7);
        System.out.println(queue.pop());
        System.out.println(queue.top());


    }
}
