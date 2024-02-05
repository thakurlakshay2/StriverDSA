package LinkedList;

//https://takeuforward.org/data-structure/add-two-numbers-represented-as-linked-lists/
public class AddTwoNumbers extends  ReverseLinkedList {

    public void addNumbersReperesntedAsLinkedList(LL l1,LL l2){


        LL t1=l1;
        LL t2=l2;
        int carry=0;
        LL ans=new LL(0,null);
        LL travel=ans;
        while(t1!=null || t2!=null){
            int sum= (t1!=null?t1.val: 0) + (t2!=null?t2.val: 0) +carry;
            travel.next=new LL(sum%10,null);
            travel=travel.next;
            carry=sum/10;
            if(t1!=null) t1=t1.next;

            if(t2!=null) t2=t2.next;
        }

        reverseLikedListOptimised(ans.next);


    }
}
