package LinkedList;

//https://takeuforward.org/data-structure/rotate-a-linked-list/
public class RotateALLWithK {

    public void rotateK(LL head, int k){


        int length=0;
        LL travel=head;
        while (travel!=null){
            travel=travel.next;
            length++;
        }

        k=k%length;
        if(k==0){
           PrintLL.print(head);
            return;
        }
        int end=length-k;
        int i=0;
        travel=head;
        while (i<end-1 ){

            travel=travel.next;
            i++;
        }
        LL point=travel.next;
        travel.next=null;
        LL t1=point;
        while (t1.next!=null){
            t1=t1.next;
        }

        t1.next=head;

        PrintLL.print(point);

    }
}
