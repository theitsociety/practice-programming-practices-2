package module1_october.week1;

public class Reverse {

    public static String reverseString(String s){

        String reversedString = "";

        // String immutable
        for (int i = s.length() - 1; i >=0 ; i--) {
            reversedString += s.charAt(i);
        }

        //reversedString = o
        //reversedString = ol
        //reversedString = oll
        //reversedString = olle
        //reversedString = olleH


        return reversedString;
    }

    public static String reverseString2(String s){

        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static String reverseString3(String s){
        // two pointer
        // hello - oellh
        // f   b

        char[] arr = s.toCharArray();

        int forward = 0;
        int backward =s.length() - 1;

        //O(n)
        while(forward <  backward){
            char temp = arr[backward];
            arr[backward] = arr[forward];
            arr[forward] = temp;

            forward++;
            backward--;
        }

        return new String(arr);

    }

    public static void main(String[] args) {
        String s = "Hello";

        assert reverseString3(s).equals("olleH");
    }
}
