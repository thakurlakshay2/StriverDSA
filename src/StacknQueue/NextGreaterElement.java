package StacknQueue;

import java.util.Stack;

//https://takeuforward.org/data-structure/next-greater-element-using-stack/
public class NextGreaterElement {
    public void nge(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--){
           while (!st.isEmpty() && arr[st.peek()]<=arr[i%n]){

               st.pop();
           }
           if(i<n) {
               if (!st.isEmpty()) System.out.print(arr[st.peek()] + " ");
               else System.out.print(" -1 ");
           }
           st.push(i%n);
        }
        System.out.println();
    }
}
