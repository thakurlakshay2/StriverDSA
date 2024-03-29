package LinkedList;

public class LL {
    int val;
    LL next;
    LL random;

    public LL(int val){
        this.val=val;
        this.next=null;
        this.random=null;
    }
    public LL(int val, LL next) {
        this.val = val;
        this.next = next;
        this.random=null;
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
