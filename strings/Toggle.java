import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        // System.out.println(str); 
        //toggle
        // pHySIcS---->PhYsiCsṇ
        for(int i =0 ;i<str.length();i++){
            // P-->p
            //check -->alphabet- small,capital
            boolean flag=true;
            char ch = str.charAt(i);
            if(ch==' ')continue;
            int ascii =(int)ch;
            if(ascii>=97) flag= false;
             if(flag==true){
                ascii+=32;
                char dh = (char)ascii;
                str.setCharAt(i,dh); 
             }
             else{
                ascii -=32;
                char dh =(char)ascii;
                str.setCharAt(i,dh);
             }

        } 
        System.out.println(str);
    }
}
 