import java.util.*;
public class characterRemove {
    public static String remove(String s,char c){
        StringBuilder sb= new StringBuilder(s);
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)==c) {
                sb.deleteCharAt(i);


            }
        }
        return sb.toString();


    }
    public static void main(String[] args) {
        String s="geeksforgeeks";
        char ch='e';
        System.out.println(remove(s,ch));
    }
}
