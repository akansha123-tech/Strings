public class substring {
    public static void main(String[] args) {
        // String str = "Hello Akansha";
        // System.out.println(str.substring(1));
        // String s = "abcdefg";
        // System.out.println(s.substring(1,5));
        String str ="abcd";
        for(int i =0;i<3;i++){
            for(int j=i+1;j<4;j++){
                System.out.print(str.substring(i,j)+"  ");
            }
        }
    
    
    }
}
