package Strings;

import java.util.HashMap;

public class ValidAnagram {

    public void anagram(String txt,String pat){
        HashMap<Character,Integer> map=new HashMap<>();

        for(char val:txt.toCharArray()){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }

        for(char val:pat.toCharArray()){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }
    }
}
