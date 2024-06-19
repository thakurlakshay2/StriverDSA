package Trie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://www.geeksforgeeks.org/problems/power-set4302/1
public class PowerSet {

    public static void main(String[] args) {
        String s="abc";
        List<String> result=new ArrayList<String>();
        int n=s.length();
        for(int i=0;i<(1<<n);i++)
        {
            String sub="";
            for(int j=0;j<n;j++)
            {
                if((i & (1<<j))!=0)
                {
                    sub+=s.charAt(j);
                }
            }
            if(!sub.isEmpty())
            {
                result.add(sub);
            }
        }
        Collections.sort(result);
        System.out.println( result);
    }
}
