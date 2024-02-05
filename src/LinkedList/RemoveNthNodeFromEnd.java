package LinkedList;


//https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/
public class RemoveNthNodeFromEnd {

    //Unoptimised approach will be to travel the Linked List twice
    public void removeNthNodeFromEndOptimised(LL head,int n){
        LL slow=head;
        LL fast=head;

        for(int i=0;i<n;i++){
            fast= fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        if(slow.next!=null){
            slow.next= slow.next.next;
        }


        PrintLL.print(head);

    }
}
