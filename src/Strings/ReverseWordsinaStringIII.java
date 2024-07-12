package Strings;

public class ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        String[] st=s.split(" ");
        for(int i=0;i<st.length;i++){
            String input=st[i];
            StringBuilder input1 = new StringBuilder();
            input1.append(input);
            input1.reverse();
            st[i]=input1.toString();
        }
        StringBuilder sb=new StringBuilder();
        for(String s1:st){
            sb.append(s1+" ");

        }


        return sb.toString().trim();
    }
    public static void main(String[] args) {
        ReverseWordsinaStringIII q=new ReverseWordsinaStringIII();
        q.reverseWords("Testing this is case , ");
    }
}
