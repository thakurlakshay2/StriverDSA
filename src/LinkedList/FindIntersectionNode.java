package LinkedList;

//https://takeuforward.org/data-structure/find-intersection-of-two-linked-lists/
public class FindIntersectionNode {
    //Brute solution O(m*n) basically vist every node in li , the move one node ahead in l2 , then do same until u get common node.

    //Difference in length
    //assuming l1 > l2
    public void findIntersection(LL l1, LL l2){
        int length1=Length.lengthLL(l1);
        int length2=Length.lengthLL(l2);
        LL travel1=l1;
        for(int i=0;i<length1-length2;i++){
            travel1=travel1.next;
        }
        LL travel2=l2;
        while(travel2 != travel1 && travel1!=null){
            travel1=travel1.next;
            travel2=travel2.next;
        }

        if(travel1==travel2 && travel1!=null){
            System.out.println(travel1.val);
        }else{
            System.out.println("null");
        }
    }
}
