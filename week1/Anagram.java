package module1_october.week1;

import java.util.Arrays;

public class Anagram {
    public static boolean checkAnagram(String s, String t){

        // string - > sort -> array
        char[] s1 = s.toCharArray(); //['h','e','a','r','t']
        char[] t1 = t.toCharArray(); // [e,a,r,t,h]


        // sort - O(nlogn)
        Arrays.sort(s1); // [a,e,h,r,t]
        Arrays.sort(t1); // [a,e,h,r,t]

        return Arrays.equals(s1,t1);

        //Time complexity: O(nlogn)
    }


    public static boolean checkAnagram2(String s, String t){

        int[] freq = new int[26];

        // O(n)
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i); //h
            freq[chr - 'a']++;
        }

        // O(n)
        for (int i = 0; i < t.length(); i++) {
            char chr = t.charAt(i); //h
            freq[chr - 'a']--;
        }

        // O(n)
        for(int fre: freq){
            if(fre != 0) return false;
        }

        //O(n)

        return true;
    }


    //solution 3
    public static void Same1(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            str2 = str2.replaceFirst(""  + str1.charAt(i) , "");
        }
        System.out.println(str2.isEmpty() ? "Anagram" : "NOT Anagram");

    }


    public static void main(String[] args) {
        String s = "heart";
        String t = "earth";

        // [1  1   1  1  1]
        // [0  0   0  0  0]

        assert checkAnagram(s, t) == true;

        String s1 = "car";
        String t1 = "race";

        assert checkAnagram(s1, t1) == false;
    }
}


/*

    Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

    Input: s = "anagram", t = "nagaram"
    Output: true

    Input: s = "rat", t = "car"
    Output: false

    s and t consist of lowercase English letters.


*/