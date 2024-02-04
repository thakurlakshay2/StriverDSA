package Arrays;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
    public void longestSubstringWithRepeatingOptimised(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        char[] ch=str.toCharArray();
        int maxLength=0;
        int maxTn=0;
        for(int i=0;i<ch.length;i++){
            if(map.containsKey(ch[i])){

                maxLength=Math.max(maxLength,maxTn);
                maxTn=i-map.get(ch[i]);

            }else{
                maxTn++;
            }
            map.put(ch[i],i);

        }
        System.out.println(maxLength);
    }
}
