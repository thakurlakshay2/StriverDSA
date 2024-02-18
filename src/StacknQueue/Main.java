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

        balancedParenthesis q1=new balancedParenthesis();
        System.out.println(q1.balanceCheck("()[{}()]"));
        NextGreaterElement q2=new NextGreaterElement();
        q2.nge(new int[]{5,7,1,2,6,0});


        NextSmallestElement q3=new NextSmallestElement();
        q3.nse(new int[]{4,5,2,10,8});

//        LRU lru=new LRU(5);
//
//        lru.put(new int[]{1,1});
//        lru.put(new int[]{2,2});
//        lru.put(new int[]{3,3});
//        lru.put(new int[]{4,4});
//        lru.put(new int[]{5,5});
//        System.out.println(lru.get(1));
//        System.out.println(lru.get(3));
//        System.out.println(lru.get(4));
//        System.out.println(lru.get(6));
//
//        lru.put(new int[]{6,6});
//        System.out.println(lru.get(6));
//        System.out.println(lru.get(1));
//        System.out.println(lru.get(2));
//        System.out.println(lru.get(3));
//        System.out.println(lru.get(4));
//        System.out.println(lru.get(5));


        //USE LFU
        AreaOfHistogram q4=new AreaOfHistogram();
        q4.histogramOptimisedApproach1(new int[]{2,1,5,6,2,3});

        SlidingWindowMaximum q5=new SlidingWindowMaximum();
        q5.slide(new int[]{1,3,-1,-3,5,3,6,7},3);


        MinStack q6=new MinStack();
        q6.push(1);
        q6.push(3);
        q6.push(4);
        q6.push(2);
        q6.push(0);
        q6.push(9);
        System.out.println(q6.min());
        System.out.println(q6.pop());
        System.out.println(q6.pop());
        System.out.println(q6.min());
    }
}
