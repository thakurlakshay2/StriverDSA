package LinkedList;

public class OddEvenList {

    public void seperateOddEven(LL head){
        if (head == null) System.out.println("Input to dall sale");
        LL odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        PrintLL.print(head);
    }
}
