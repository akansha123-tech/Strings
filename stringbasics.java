import java .util.*;
public class stringbasics{
    public static void main(String[] args) {
        // String str ="hello world";
        // System.out.println(str);
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextline();  // toprint string with space 
        // System.out.println(s);
         String str ="Akansha";
        //  System.out.println(str.charAt(3));
        System.out.println(str.indexOf('s'));
        System.out.println(str.contains("A"));

        System.out.println(str.endsWith("haa"));

        String s = "Akki";
        System.out.println(s.toUpperCase());
        System.out.println(s.concat(str));
    }  
}