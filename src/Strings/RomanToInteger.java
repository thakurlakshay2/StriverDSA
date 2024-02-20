package Strings;

import java.util.HashMap;

public class RomanToInteger {
    private HashMap<Character,Integer> map;

    public RomanToInteger() {
       map=new HashMap<>();
        map.put('I',             1);
        map.put('V',             5);
        map.put('X',             10);
        map.put('L',             50);
        map.put('C',             100);
        map.put('D',             500);
        map.put('M',             1000);
    }

    public void rToI(String str){
        int n=str.length();
        int ans=0;
        for(int i=n-1;i>=0;i--){
            char ch=str.charAt(i);
            ans+=map.get(ch);
            if(i!=n-1 && (ch=='I' || ch=='X' || ch=='C')){
                char getBef=str.charAt(i+1);
                switch (ch){
                    case'I':
                        if(getBef=='X' || getBef=='V'){
                            ans-= 2*map.get(ch);

                        }
                        break;
                    case'X':
                        if(getBef=='L' || getBef=='C'){
                            ans-= 2*map.get(ch);

                        }
                        break;
                    case 'C':
                        if(getBef=='D' || getBef=='M'){
                            ans-= 2*map.get(ch);

                        }
                        break;
                }


            }
        }

        System.out.println(ans);
    }
}
