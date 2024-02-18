package StacknQueue;

import java.util.ArrayList;
import java.util.HashMap;

//https://takeuforward.org/data-structure/implement-lru-cache/
public class LFU {
    private static class Node{
        int val;
        int freq;


        private Node(int val,int freq) {
            this.val = val;
            this.freq=freq;

        }




    }
    private int capacity;
    private int min;
    private HashMap<Integer, Node> cache;
    private HashMap<Integer, ArrayList<Integer>> count;

    //To improve getting time,, ple use LinkedHashSet<> for "count"
    public LFU(int capacity){
        this.capacity=capacity;
        cache=new HashMap<>();
        count=new HashMap<>();
        min=0;
    }
    public void put(int[] val){

        if(cache.containsKey(val[0])){
            cache.get(val[0]).val=val[1];
            get(val[0]);
            return ;
        }
        else if(cache.size()== capacity){
            int key=count.get(min).remove(0);

            cache.remove(key);
        }
        Node n=new Node(val[1],1);

        int key=val[0];

        cache.put(key,n);
        if(!count.containsKey(1)){
            count.put(1,new ArrayList<>());
        }
        count.get(1).add(val[0]);
    }
    public int get(int key){
        if(capacity<0){
            return -1;
        }
        if(!cache.containsKey(key)){
            return -1;
        }
        int predvFreq=  cache.get(key).freq;
        cache.get(key).freq++;

        count.get(predvFreq).remove(key);
        if(!count.containsKey(predvFreq+1)){
            count.put(predvFreq+1,new ArrayList<>());
        }
        count.get(predvFreq+1).add(key);
        return cache.get(key).val;
    }





}
