package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list= LL.createLL(new int[]{1,3,4,5,6});
        PrintLL.print(list);
        ReverseLinkedList q1=new ReverseLinkedList();
//        q1.reverseLikedListBrute(list);
        list= q1.reverseLikedListOptimised(list);

        FindMiddleOfLL q2=new FindMiddleOfLL();
        q2.findMiddle(list);

        LL list1= LL.createLL(new int[]{1,3,5,7});
        LL list2= LL.createLL(new int[]{0,2,4,6,8,9,10});
        MergeTwoSortedLinkedList q3=new MergeTwoSortedLinkedList();
        q3.mergeTwoSortedLinkedListOptimised(list1,list2);

         list2= LL.createLL(new int[]{0,2,4,6,8,9,10});
        RemoveNthNodeFromEnd q4=new RemoveNthNodeFromEnd();
        q4.removeNthNodeFromEndOptimised(list2,3);

        list1=LL.createLL(new int[]{3,0,2});
        list2=LL.createLL(new int[]{2,4});
        AddTwoNumbers q5=new AddTwoNumbers();
        q5.addNumbersReperesntedAsLinkedList(list1,list2);

        list1=LL.createLL(new int[]{1,2,3,4,5});
        DeleteNodeLL q6=new DeleteNodeLL();
        q6.deleteNodeOptimal(list1.next.next.next);
        PrintLL.print(list1);
    }
}
