package LinkedList;

//https://leetcode.com/problems/sort-list/solutions/46714/java-merge-sort-solution/
public class SortLL {


    // use merge sort...

    //time : O(nlog(n))
    //space  O(1) constant
    public LL sort(LL head){
        if (head == null || head.next == null)
            return head;


        LL prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;


        LL l1 = sort(head);
        LL l2 = sort(slow);


        return merge(l1, l2);
    }

    LL merge(LL l1, LL l2) {
        LL l = new LL(0), p = l;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null)
            p.next = l1;

        if (l2 != null)
            p.next = l2;

        return l.next;
    }
}
