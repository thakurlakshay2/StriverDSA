package StacknQueue;

import java.util.HashMap;

//https://takeuforward.org/data-structure/implement-lru-cache/
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
        if(cache.containsKey(val[0])) remove(val[0]);
        else if(currSize==capacity) remove(head.next.val);


        add(val);
    }
    public int get(int val){
        if(cache.containsKey(val)){

            Node n=remove(val);

            add(new int[]{val,n.val});

            return n.val;
        }
        else{
            return -1;
        }
    }
    private Node remove(int n){

       Node rem=cache.get(n);

        Node pre=rem.prev;
        Node nex=rem.next;

        pre.next=nex;
        nex.prev=pre;

        rem.prev=null;
        rem.next=null;
        cache.remove(n);
        currSize--;
        return rem;
    }
    //first occurance
    private void add(int[] val){

        Node n;
        if(cache.containsKey(val[0])) n=cache.get(val[0]);
        else {
            n=new Node(val[1]);
            cache.put(val[0],n);
            currSize++;
        }

        addNode(n);

    }

    //reoccurance
    private void addNode(Node v){
       Node trueTail=tail.prev;
       trueTail.next=v;
       v.prev=trueTail;

       tail.prev=v;
       v.next=tail;

    }





}
