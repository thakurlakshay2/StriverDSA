package LinkedList;

public class LL {
    int val;
    LL next;

    public LL(int val, LL next) {
        this.val = val;
        this.next = next;
    }

    public static LL createLL(int[] num){
       LL node=new LL(0,null);
       LL travel=node;
       for(int val:num){
           travel.next=new LL(val,null);
           travel=travel.next;
       }


       return node.next;
    }
}
