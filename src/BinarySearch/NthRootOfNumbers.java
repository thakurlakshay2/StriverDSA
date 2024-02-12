package BinarySearch;

//https://takeuforward.org/data-structure/nth-root-of-a-number-using-binary-search/
public class NthRootOfNumbers {

    public void nthRoot(int n, int m){
        searchBrute(n,m);
        searchOptimised(n,m);
    }

    //O n
    private void searchBrute(int n,int m){
        for(int i=1;i<=m;i++){
            long a=func(i,n);
            if(a== (long)m) {
                System.out.println(i);
                return ;
            }else if(a> (long)m) break;
        }
        System.out.println("NO ans");

    }

    private void searchOptimised(int n,int m){
        int i=1;
        int j=m;
        while(i<j){
            int mid=(i+j)/2;
            long a=func(mid,n);
            if(a== (long)m) {
                System.out.println(mid);
                return ;
            }else if(a> (long)m) j=mid;
            else{
                i=mid+1;
            }
        }

        System.out.println("NO ans");

    }
    private long func(int a,int b){
        long ans=1;
        long base=b;
        while(a>0){
            if(a%2==1){
                a--;
                ans=ans*base;
            }else{
                a=a/2;
                base=base*base;
            }
        }
        return ans;
    }
}
