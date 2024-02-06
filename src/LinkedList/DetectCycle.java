package LinkedList;

//https://takeuforward.org/data-structure/detect-a-cycle-in-a-linked-list/
public class DetectCycle {
    public void detectCycleOptimised(LL l1){
        LL slow=l1;
        LL fast=l1.next ;

        while(fast!=null && fast.next!=null){
            if(slow==fast){
                System.out.println("Cycle Found");
                return;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Cycle Not found");

        //
    }

    //there has to be a loop to run this code
    public void findLengthOfCycle(LL l1){
        LL slow=l1;
        LL fast=l1.next ;

        while(fast!=null && fast.next!=null){
            if(slow==fast){

               break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        int loopSize=1;
        LL travel=slow;


        while(travel.next!=slow){
            loopSize++;
            travel=travel.next;

        }
        System.out.println("Cycle Loop Size "+ (loopSize+1));

    }

    public void findStartPointOfLoop(LL l1){
        LL slow=l1;
        LL fast=l1.next ;

        while(fast!=null && fast.next!=null){
            if(slow==fast){
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow!=fast){
            System.out.println("NO LOOP");
            return;

        }
        slow=l1.next;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(slow.val);
    }

}
