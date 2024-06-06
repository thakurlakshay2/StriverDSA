package Strings;

import java.util.Stack;

public class ReverseAllWordsInAString {
    //time: O(n);
    //space : O(1) no stack used
    public static void main(String[] args) {
            String s="cat in a dog world";
            Stack<String> st=new Stack<>();
            int i=0;
            int ls=0;
            String str="";
            while(i<s.length() ){

                if(i==s.length()-1){
                    if(s.charAt(i)==' '){
                        if(ls<i){
                            //      System.out.println("gg");
                            str=s.substring(ls,i)+" "+str;
                            //        st.push(s.substring(ls,i));
                        }
                    }
                    else{
                        str=s.substring(ls,i+1)+" "+str;
                        //   st.push(s.substring(ls,i+1));
                    }
                    break;
                }

                if(s.charAt(i)==' '){
                    if(ls!=i){
                        str=s.substring(ls,i)+" "+str;
                        //       st.push(s.substring(ls,i));
                    }

                    ls=i+1;

                }

                i++;
            }

            // System.out.println(st.size());
            // while(st.size()>0){
            //     if(st.size()>1){
            //          str+=st.pop()+" ";
            //     }
            //     else{
            //         str+=st.pop();
            //     }
            // }
//            if(str.length()==0){
//                return "";
//            }
            System.out.println( str.substring(0,str.length()-1));
    }
}
