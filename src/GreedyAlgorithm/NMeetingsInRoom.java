package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//https://takeuforward.org/data-structure/n-meetings-in-one-room/
public class NMeetingsInRoom {
    private static class Meeting{
        int st;
        int end;
        int pos;
        public Meeting(int st, int end,int pos) {
            this.st = st;
            this.end = end;
            this.pos=pos;
        }
    }
    public void nMeetingsInRoom(int[] start,int[] end){
        Meeting[] meeting=new Meeting[start.length];
        for(int i=0;i<start.length;i++ ){
            meeting[i]=new Meeting(start[i],end[i],i+1);
        }
        Arrays.sort(meeting, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                if (o1.end < o2.end)
                    return -1;
                else if (o1.end > o2.end)
                    return 1;
                else if(o1.pos < o2.pos)
                    return -1;
                return 1;
            }
        });
        ArrayList<Integer> array=new ArrayList<>();
        array.add(meeting[0].pos);
        int limit=meeting[0].end;
        for(int i=1;i<start.length;i++){
            if(meeting[i].st>limit){
                array.add(i);
                limit=meeting[i].end;
            }
        }
        System.out.println(array.size());
    }
}
