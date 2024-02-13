package Heaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//https://www.codingninjas.com/studio/problems/min-heap_4691801?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website
public class MinHeap {
    private int[] minHeap;
    private int[] maxHeap;
    private final int capacity=1000;
   private int heap_size;

   //Adding a whole array will be  , oNlog(n)
   public void buildHeapFromArray(int[] nums){
       Arrays.sort(nums);
       minHeap=new int[1000];
       maxHeap=new int[1000];
       heap_size=nums.length;
       for(int i=0;i<nums.length;i++){
           minHeap[i]=nums[i];
           maxHeap[nums.length-1-i]=nums[i];
       }

   }
   public int getMin(){
       return this.minHeap[0];
   }
    public int getMax(){
        return this.maxHeap[0];
    }

    private int parent(int idx){
       return (idx-1)/2;
    }
    private  void swap(int[] heap,int idx , int idx2){
       int temp=heap[idx];
       heap[idx]=heap[idx2];
       heap[idx2]=temp;

    }
    public boolean push(int val){
        if(capacity< heap_size){
            return false;
        }
        int i=heap_size;
        minHeap[i]=val;
        maxHeap[i]=val;
        heap_size++;


        while(i!=0 && minHeap[i]<minHeap[parent(i)]){
            swap(minHeap,i,parent(i));
            i=parent(i);
        }

        while(i!=0 && maxHeap[i]>maxHeap[parent(i)]){
            swap(maxHeap,i,parent(i));
            i=parent(i);
        }
        return true;
    }

    public int[] pop(){
       if(heap_size==0){
               return new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE};
       }
       heap_size--;
       if(heap_size==0){
          return new int[]{minHeap[0],maxHeap[0]};
       }
        int val=minHeap[0];
       minHeap[0]=minHeap[heap_size];
       minHeapify(0);

        heap_size--;
        if(heap_size==0){
                return new int[]{maxHeap[0],maxHeap[0]};
        }
        int val2=maxHeap[0];
        maxHeap[0]=maxHeap[heap_size];
        maxHeapify(0);


       return new int[]{val,val2};
    }

    private void minHeapify(int idx){
       int l= idx*2+1;
       int r=idx*2+2;

       int smallest=idx;
       if(l<heap_size && minHeap[l]<minHeap[smallest]){
           smallest=l;
       }
        if(r<heap_size && minHeap[r]<minHeap[smallest]){
            smallest=r;
        }

        if(smallest!=idx){
            swap(minHeap,idx,smallest);
            minHeapify(smallest);
        }
    }

    private void maxHeapify(int idx){
        int l= idx*2+1;
        int r=idx*2+2;

        int smallest=idx;
        if(l<heap_size && minHeap[l]>minHeap[smallest]){
            smallest=l;
        }
        if(r<heap_size && minHeap[r]>minHeap[smallest]){
            smallest=r;
        }

        if(smallest!=idx){
            swap(maxHeap,idx,smallest);
            maxHeapify(smallest);
        }
    }
}
