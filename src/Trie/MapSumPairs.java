package Trie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSumPairs {
    static class MapSum {

        Map<String,Integer> maplist=null;
        public MapSum() {
            this.maplist=new HashMap<String,Integer>();
        }

        public void insert(String key, int val) {
            maplist.put(key,val);
        }

        public int sum(String prefix) {
            Set<String> setlist=maplist.keySet();
            int count=0;
            for(String s:setlist){
                if(s.startsWith(prefix)) count+=maplist.get(s);
            }
            return count;
        }
    }
    public static void main(String[] args) {
        MapSumPairs o=new MapSumPairs();

        MapSum a1=new MapSum();
        a1.insert("apple",3);
        a1.sum("ap");
        a1.insert("app",2);
        a1.sum("ap");

    }
}
