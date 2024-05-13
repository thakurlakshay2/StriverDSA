package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

//https://takeuforward.org/data-structure/length-of-longest-substring-without-any-repeating-character/
public class LengthOfLongestSubstringWIthoutRepeatingCharacter {

    //time : O(n*n)
    ///space o(n)
    public void bruteApproach(String str){

        if(str.length()==0)
            System.out.println(0);
        int maxans = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++)
        {
            Set< Character > se = new HashSet< >();
            for (int j = i; j < str.length(); j++)
            {
                if (se.contains(str.charAt(j)))

                {
                    maxans = Math.max(maxans, j - i);
                    break;
                }
                se.add(str.charAt(j));
            }
        }
        System.out.println( maxans);
    }

    //time : O(n)
    //space O(n)
    public static void optimalApproach(String str){


        int maxans = Integer.MIN_VALUE;
        Set < Character > set = new HashSet < > ();
        int l = 0;
        for (int r = 0; r < str.length(); r++) // outer loop for traversing the string
        {
            if (set.contains(str.charAt(r))) //if duplicate element is found
            {
                while (l < r && set.contains(str.charAt(r))) {
                    set.remove(str.charAt(l));
                    l++;
                }
            }
            set.add(str.charAt(r));
            maxans = Math.max(maxans, r - l + 1);
        }

        System.out.println( maxans);
    }

    public static void main(String[] args) {

        optimalApproach("randomtestrs");
    }
}
