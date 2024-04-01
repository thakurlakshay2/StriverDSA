package Heaps;

public class TaskScheduler {
    public static void ts(char[] tasks,int delay){
        int[] counter=new int[26];
        int max=0;
        int maxCount=0;

        for(char ch: tasks){
            int idx=ch-'A';
            counter[idx]++;

            if(max==counter[idx]){
                maxCount++;
            }else if(max<counter[idx]){
                maxCount=1;
                max=counter[idx];
            }
        }

        int portionCount=max-1;
        int protionLength=delay-(maxCount-1);

        int emptySlots=portionCount*protionLength;
        int availableTask= tasks.length-max*maxCount;
        int idle=Math.max(0,emptySlots-availableTask);

        System.out.println(tasks.length+idle);

    }
    public static void main(String[] args) {
        ts(new char[]{'A','B','A','C','D','F','A','F','C'},3);
    }
}
