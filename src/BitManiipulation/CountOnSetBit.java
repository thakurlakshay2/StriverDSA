package BitManiipulation;

//Question was in form of making packets in power of 2
// se have to give minimum number of power packets we should make.
public class CountOnSetBit {
    public int countSetBits(int n){
        int count=0;
        while(n>0){
            count+=n&1;
            n>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        CountOnSetBit o=new CountOnSetBit();
        o.countSetBits(33);
    }
}
