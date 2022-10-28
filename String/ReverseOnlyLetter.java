
import java.util.ArrayList;

import java.util.Collections;
import java.util.Stack;

public class ReverseOnlyLetter {
    public static String reverseOnlyLetters(String s) {

        ArrayList<Character> list = new ArrayList<>();

        Stack<Character> letter = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (letterfinder(s.charAt(i))) {

                letter.push(s.charAt(i));
            }
        }

        ArrayList<Character> list2 = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list2.add(s.charAt(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            if (letterfinder(list2.get(i))) {
                list2.set(i, letter.peek());
                letter.pop();
            }

        }

        String ans = "";

        for (int i = 0; i < list2.size(); i++) {
            ans = ans + list2.get(i);
        }

        s = ans;

        return s;

    }

    public static boolean letterfinder(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z');
    }

    public static void main(String[] args) {

        String s = "qW12 {+";

        System.out.println(reverseOnlyLetters(s));

    }
}