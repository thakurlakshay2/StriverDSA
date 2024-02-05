package LinkedList;

//https://takeuforward.org/data-structure/find-middle-element-in-a-linked-list/
public class FindMiddleOfLL {
    public void findMiddle(LL head){
        LL slow=head;
        LL fast=head;

        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.val);

    }
}
