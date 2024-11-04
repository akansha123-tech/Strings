import java.util.*;
public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        // str.append("Akansha");
        // str.setCharAt(0,'p');
        // str.append('j');
        // str.insert(2,'p');
        // str.deleteCharAt(2);
        str.reverse() ;
        str.delete(2,4);
        System.out.println(str);
    }
}
