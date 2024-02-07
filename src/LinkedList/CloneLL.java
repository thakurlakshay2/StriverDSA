package LinkedList;

// https://takeuforward.org/data-structure/clone-linked-list-with-random-and-next-pointer/
public class CloneLL {

    public void CloneWithNextPointer(LL head){

        LL travel=head;;

        while (travel!=null){
            LL newNode=new LL(travel.val);
            LL temp=travel.next;
            travel.next=newNode;
            newNode.next=temp;
            travel=temp;
        }
        travel=head;
        LL newNode=travel.next;
        while(newNode !=null &&newNode.next!=null  ){


            newNode.next=newNode.next.next;
            newNode=newNode.next;
        }
        PrintLL.print(head.next);
        PrintLL.print(head);
    }
}
