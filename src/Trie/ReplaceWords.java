package Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/replace-words/description/
public class ReplaceWords {
    class TrieNode {
        char node;
        Map<Character, TrieNode> child;
        boolean isEnd;

        TrieNode(char node) {
            this.node = node;
            this.child = new HashMap<>();
            this.isEnd = false;
        }
    }
    private TrieNode root;

    private void buildTrie(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            cur.child.putIfAbsent(c, new TrieNode(c));
            cur = cur.child.get(c);
        }
        cur.isEnd = true;
    }

    private String queryTrie(String word) {
        TrieNode cur = root;
        StringBuilder s = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (!cur.child.containsKey(c)) return word;
            cur = cur.child.get(c);
            s.append(c);
            if (cur.isEnd) return s.toString();
        }
        return word;
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        root = new TrieNode('/');

        for (String word : dictionary) {
            buildTrie(word);
        }

        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            ans.append(queryTrie(words[i]));
            if (i != words.length - 1) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        ReplaceWords o=new ReplaceWords();
        List<String> ans=new ArrayList<>();
        ans.add("cat");
        ans.add("bat");
        ans.add("rat");

        o.replaceWords(ans,"the cattle was rattled by the battery");
    }
}
