package LinkedList;

import java.util.Stack;

public class CheckPallindrome {

    public void checkPallindromeLL(LL head){
        Stack<LL> stack=new Stack<>();
        LL travel=head;
        while(travel!=null){
            stack.push(travel);
            travel=travel.next;
        }
        travel=head;
        while (!stack.isEmpty()){
            LL  temp=stack.pop();
            if(temp.val!=travel.val){
                    System.out.println("Not a pallindrome");
              return;
            }
            travel=travel.next;
        }
        System.out.println(" A pallindrome");

    }
}
