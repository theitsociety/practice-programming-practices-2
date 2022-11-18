package module1_october.week1;

import java.util.ArrayList;

public class Str {

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("before modifying the string: " + s);

        modifyString(s);

        System.out.println("after modifying the string: " + s);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println("before modifying the list: " + arrayList);

        modifyList(arrayList);

        System.out.println("before modifying the list: " + arrayList);

    }

    public static void modifyString(String s){
        s += " Ahmet";
        System.out.println("Modified string: " + s);
    }

    public static void modifyList(ArrayList<Integer> list){
        list.add(4);
        System.out.println("Modified list:" + list);
    }
}
/*
    before modifying the string: Hello

    Modified string: hello Ahmet

    after modifying the string: hello


   before modifying the list: 123

    Modified list: 1234

    before modifying the list: 1234

* */