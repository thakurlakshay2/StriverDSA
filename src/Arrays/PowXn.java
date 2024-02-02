package Arrays;
//https://takeuforward.org/data-structure/implement-powxn-x-raised-to-the-power-n/
public class PowXn {

    public void implementPowXnBrute(double x, int n){
        double ans=1;
        for(int i=1;i<n;i++){
            ans*=x;
        }
        System.out.println(ans);
    }

    public void implementPowXnOptimised(double x, int n){
        double ans=1.0;
        long nn=n;
        if(nn<0) nn=-1*nn;
        while (nn>0){
            if(nn%2==1){
                ans=ans*x;
                nn=nn-1;
            }else{
                x=x*x;
                nn=nn/2;
            }
        }
        System.out.println(ans);
    }
}
