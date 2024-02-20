package Strings;

import java.util.Stack;

public class ReverseAString {

    //Unoptimised approach , using a stack , same time but space complexity is more
    public void reverse(String str){
        String[] st=str.trim().split((" "));
        StringBuilder ans= new StringBuilder();
        Stack<String> stack=new Stack<>();
        for(int i=0;i<st.length;i++){
            stack.push(st[i]);
        }

        while(!stack.isEmpty()){
            ans.append(stack.pop()+" ");

        }

        System.out.println(ans);
    }

    public void reverseOptimised(String str){
            StringBuilder temp=new StringBuilder();
            for(char val:str.toCharArray()){
                if(val == ' ' ){
                    str=temp.toString() +' '+str;
                    temp=new StringBuilder();
                }else{
                    temp.append(val);
                }
            }
            str=temp+" "+str;
            str=str.substring(0,str.length()/2);
            System.out.println(str);
    }
}
