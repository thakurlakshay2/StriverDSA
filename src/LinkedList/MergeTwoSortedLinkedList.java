package LinkedList;

//https://takeuforward.org/data-structure/merge-two-sorted-linked-lists/
public class MergeTwoSortedLinkedList {
    public void mergeTwoSortedLinkedListOptimised(LL list1, LL list2){
        LL travel=new LL(-1,null);
        LL travelT=travel;
        LL t1=list1;
        LL t2=list2;

        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                travelT.next=t1;
                t1=t1.next;

            }else{
                travelT.next=t2;
                t2=t2.next;
            }


            travelT=travelT.next;
        }
        while(t1!=null){
            travelT.next=t1;
            t1=t1.next;
            travelT=travelT.next;
        }
        while(t2!=null){
            travelT.next=t2;
            t2=t2.next;
            travelT=travelT.next;
        }
        PrintLL.print(travel.next);
    }
}
