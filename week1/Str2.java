package module1_october.week1;

public class Str2 {
    public static void main(String[] args) {
        //String literal
        String a = "abc";
        String b = "abc";

        System.out.println(a == b);  // true

        //String object
        String c = new String("abc");
        String d = new String("abc");
        System.out.println(c == d);  // false

    }
}
