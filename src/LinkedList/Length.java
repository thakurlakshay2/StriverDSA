package LinkedList;

public  class Length {
    public static int lengthLL(LL l1){
        int len=0;
        LL travel=l1;
        while(travel!=null){
            travel=travel.next;
            len++;
        }

        return len;
    }


}
