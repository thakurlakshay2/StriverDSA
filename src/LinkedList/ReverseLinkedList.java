package LinkedList;


import java.util.Stack;

//https://takeuforward.org/data-structure/reverse-a-linked-list/
public class ReverseLinkedList  {


    //using stack
    public void reverseLikedListBrute(LL head){
        Stack<LL> stack=new Stack<>();
        LL travel=head;
        while(travel!=null){
            stack.push(travel);
            travel=travel.next;
        }
        LL reverse=new LL(1,null);
        travel=reverse;
        while(!stack.isEmpty()){
            travel.next=stack.pop();
            travel=travel.next;
        }
        travel.next=null;

        PrintLL.print(reverse.next);
    }

    public LL reverseLikedListOptimised(LL head){
        LL reverseNode=reverseLL(head);

        PrintLL.print(reverseNode);
        return reverseNode;
    }
    public LL reverseLL(LL head){

        if(head==null || head.next==null){
            return head;
        }

        LL revHead=reverseLL(head.next);
        LL frontHead=head.next;

        frontHead.next=head;
        head.next=null;
        return revHead;
    }
}
