import java.util.*;
public class Palendrome {
    public static void main(String[] args) {
        String str="abcdcba";
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String s = gtr.toString();
        if(str.equals(s)){
            System.out.println("palendrome");
        }
        else{
            System.out.println("not a palendrome");
        }
         
    }
}
