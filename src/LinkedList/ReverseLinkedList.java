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
        LL reverseLL=reverseLL(head);

        PrintLL.print(reverseLL);
        return reverseLL;
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

    public LL reverseLLSizeK(LL head,int k){

            // Initialize a temporary
            // LL to traverse the list
            LL temp = head;

            // Initialize a pointer to track the
            // last LL of the previous group
            LL prevLast = null;

            // Traverse through the linked list
            while (temp != null) {

                // Get the Kth LL of the current group
                LL kThLL = getKthLL(temp, k);

                // If the Kth L is NULL
                // (not a complete group)
                if (kThLL == null) {

                    // If there was a previous group,
                    // link the last L to the current LL
                    if (prevLast != null) {
                        prevLast.next = temp;
                    }

                    // Exit the loop
                    break;
                }

                // Store the next LL
                // after the Kth LL
                LL nextLL = kThLL.next;

                // Disconnect the Kth LL
                // to prepare for reversal
                kThLL.next = null;

                // Reverse the LLs from
                // temp to the Kth LL
                reverseLikedListOptimised(temp);

                // Adjust the head if the reversal
                // starts from the head
                if (temp == head) {
                    head = kThLL;
                } else {
                    // Link the last LL of the previous
                    // group to the reversed group
                    prevLast.next = kThLL;
                }

                // Update the pointer to the
                // last LL of the previous group
                prevLast = temp;

                // Move to the next group
                temp = nextLL;
            }

            // Return the head of the
            // modified linked list
            return head;

    }
    private LL getKthLL(LL temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        // Return the Kth LL
        return temp;
    }

}
