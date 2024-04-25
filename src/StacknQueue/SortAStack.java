package StacknQueue;

import java.util.ListIterator;
import java.util.Stack;

public class SortAStack {

    public void sortStack(Stack<Integer> stack){
        //comment one logic to see
        useRecursion(stack);

        printStack(stack);

//        userTemporaryStack(stack);

    }


    private void useRecursion(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int x=stack.pop();
            useRecursion(stack);

            sortedInsertRecursion(stack,x);
        }
    }
    private void sortedInsertRecursion(Stack<Integer> s, int x)
    {
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        sortedInsertRecursion(s, x);
        s.push(temp);
    }


    public  void userTemporaryStack(Stack<Integer> stack){
        Stack<Integer> tmpStack=new Stack<>();
        while (!stack.isEmpty()){
            int x= stack.pop();
            while(!tmpStack.isEmpty() && tmpStack.peek()
                    < x)
            {
                stack.push(tmpStack.pop());
            }

            tmpStack.push(x);
        }
        printStack(tmpStack);
    }


    static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();
        // forwarding
        while (lt.hasNext())
            lt.next();

        // printing from top to bottom
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }
}
