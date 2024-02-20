package Strings;

public class LongestCommonPrefix {

    public void lcp(String[] arr){
        boolean endFound=false;
        int i=0;
        String s="";
        while (!endFound){
            StringBuilder ch= new StringBuilder();
            for(int j=0;j<arr.length;j++ ){
                if(i>=arr[j].length()){
                    endFound=true;
                    break;
                }
                if((ch.isEmpty()) || ch.charAt(0)==arr[j].charAt(i)){
                    ch.append(arr[j].charAt(i));
                }
            }
            if(ch.length()==arr.length){
                s+=ch.charAt(0);
            }else {
                break;
            }

                i++;
        }
        System.out.println(s);
    }
}
