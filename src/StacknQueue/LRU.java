package StacknQueue;

import java.util.HashMap;

public class LRU {
    private static class Node{
        int val;
        Node prev;
        Node next;

        private Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }

        private Node(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }

        public Node(Integer o) {
        }
    }
    private int capacity;
    private int currSize;
    private HashMap<Integer, Node> cache;
    private Node head;
    private Node tail;
    public LRU(int capacity){
        this.capacity=capacity;
        this.currSize=0;


        cache=new HashMap<>();

        this.head=new Node(0);
        this.tail=new Node(0);
        head.next=tail;
        tail.prev=head;

    }
    public void put(int[] val){
         if(cache.containsKey(val[0])){
             add(cache.get(val[0]));
         }else{

             if(capacity==currSize) {
                 System.out.println(head.next.val);
                 delete(head.next.val);
                 System.out.println(head.next.val);

             };
             add(val);
         }
    }
    public int get(int val){
        if(cache.containsKey(val)){
            add(cache.get(val));

            return cache.get(val).val;
        }
        else{
            return -1;
        }
    }
    private void delete(int n){
        Node remove= cache.get(n);
        Node prev=remove.prev;
        Node next=remove.next;
        System.out.print(prev.val +" --- "+next.val);
        prev.next=next;
        next.prev=prev;


        remove.next=null;
        remove.prev=null;
        System.out.print(remove.val +" --- "+ head.next.val);
        cache.remove(n);
    }
    //first occurance
    private void add(int[] val){
        Node n=new Node(val[1]);
        cache.put(val[0],n);
        add(n);
        currSize++;
    }

    //reoccurance
    private void add(Node v){
        Node prev=v.prev;
        Node next=v.next;

        prev.next=next;
        next.prev=prev;

        Node actTail=tail.prev;
        actTail.next=v;
        v.prev=actTail;
        v.next=tail;
        tail.prev=v;

    }





}
