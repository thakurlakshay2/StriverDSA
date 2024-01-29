package Arrays;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
   private List<List<Integer>> pascal;

    PascalTriangle(int num){
        //create pascal Triangle
        pascal= new ArrayList<List<Integer>>();
        pascalTriangleBrute(num-1,pascal);
    }
    private void pascalTriangleBrute(int n,List<List<Integer>> list){
        if(n==0) return;
        if(n==1){
            List<Integer> l=new ArrayList<>();
            l.add(1);
            list.add(0,l);
        }
        pascalTriangleBrute(n-1,list);
        if(n>=2){
            List<Integer> l=new ArrayList<>();
            List<Integer> ol=list.get(list.size()-1);
            for(int i=0;i<n;i++){
                if(i==0 || i==n-1){
                    l.add(1);
                }
                else{
                    l.add(ol.get(i-1)+ol.get(i));
                }

            }
            list.add(l);
        }

        return;
    }

    private int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
    public int pascalTriangleOptimised(int r,int c){
        //nCr mathematical solution  is the solution n!/r!*(n-r)!
        int n=r;
        int rd=c;
        return factorial(n)/factorial(rd)*factorial(n-rd);
    }
    public void printTriangle(){
        for(List<Integer> l:pascal){
            for(int a: l){
                System.out.print(a+" ");
            }
            System.out.println(" ");
        }
    }
    int getNRdata(int r, int c){

        return pascal.get(r).get(c);
    }
}
