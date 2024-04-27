package LinkedList;

//https://takeuforward.org/data-structure/remove-n-th-node-from-the-end-of-a-linked-list/
public class RemoveNthNodeFromEnd {

    //Unoptimised approach will be to travel the Linked List twice

    public void removeNodeBrute(LL head,int n){

        int length=Length.lengthLL(head);
        int front=length-n;
        LL travel=head;
        while (front>0){

            travel=travel.next;
            front--;
        }
        if(travel.next!= null ){
            travel=travel.next.next;
        }


    }
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
