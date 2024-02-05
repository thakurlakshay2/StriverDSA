package LinkedList;

//https://takeuforward.org/data-structure/delete-given-node-in-a-linked-list-o1-approach/
public class DeleteNodeLL {
    //O 1 approach , you only get node to be deleted
    //idea is to copy
    public void deleteNodeOptimal(LL node){
        node.val=node.next.val;
        node.next=node.next.next;


        //very bad approach , replication of data .
    }
}
