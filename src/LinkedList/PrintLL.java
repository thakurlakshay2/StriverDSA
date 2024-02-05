package LinkedList;

public class PrintLL {
    public static void print(LL head){
        LL travel=head;

        while(travel!=null){
            System.out.print(travel.val+" --> ");

            travel=travel.next;

        }
        System.out.println();
    }
}
